import { useState } from "react";
import { Form, Button } from "react-bootstrap";
import { addStudent } from "../../service/api";
import { useNavigate } from "react-router-dom";

const DefaultForm = () => {
  const [student, setStudent] = useState({
    name: "",
    email: "",
    gender: "",
    rollNo: "",
  });

  const navigate = useNavigate();

  async function onClickHandler(e) {
    e.preventDefault();
    console.log(student);
    // const userData = { username: username, password: password };
    addStudent(student).then((res) => {
      if (res.status === 200) {
        // document.getElementById('success-alert').innerText = res.data.msg;
        // setMessage(res.data.msg);
        // setShow(true);
        alert(res.data.msg)
        navigate("/");
      }
    });
  }

  return (
    <>
      <Form>
        <Form.Group className="mb-3" controlId="formBasicEmail">
          <Form.Label>Name</Form.Label>
          <Form.Control
            type="text"
            placeholder="Name"
            onChange={(e) => setStudent({ ...student, name: e.target.value })}
          />
        </Form.Group>
        <Form.Group className="mb-3" controlId="formBasicEmail">
          <Form.Label>Email address</Form.Label>
          <Form.Control
            type="email"
            placeholder="Email"
            onChange={(e) => setStudent({ ...student, email: e.target.value })}
          />
        </Form.Group>
        <Form.Group className="mb-3" controlId="formBasicPassword">
          <Form.Label>Roll No</Form.Label>
          <Form.Control
            type="text"
            placeholder="Roll Number"
            onChange={(e) => setStudent({ ...student, rollNo: e.target.value })}
          />
        </Form.Group>
        <Form.Group className="mb-3" controlId="formBasicCheckbox">
          <Form.Select
            size="sm"
            onChange={(e) => setStudent({ ...student, gender: e.target.value })}
          >
            <option>Select gender</option>
            <option value="m">Male</option>
            <option value="f">Female</option>
            <option value="o">Prefer not to say</option>
          </Form.Select>
        </Form.Group>
        <Button variant="primary" type="submit" onClick={onClickHandler}>
          Submit
        </Button>
      </Form>
    </>
  );
};

export default DefaultForm;
