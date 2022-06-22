import { Container } from "react-bootstrap";
import DefaultForm from "../../components/Forms/DefaultForm";
import Header from "../../components/Header/Header";

const Landing = () => {
  return (
    <div>
      <Header />
      <Container className="my-5">
        <DefaultForm />
      </Container>
    </div>
  );
};

export default Landing;
