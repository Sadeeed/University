import "./SlidingNav.css";

function SlidingNav() {

    const indicator = (e) => {
        let marker = document.querySelector('#marker')

        // vertical underline
        marker.style.left = (e.offsetLeft - 20) +"px"

        // Horizontal Underline
        // marker.style.left = (e.offsetLeft - 20) +"px"
        // uncomment to cover full width
        // marker.style.width = e.offsetWidth+"px" 
    }

    const onClickHandeler = (e) => {
      e.preventDefault();
      indicator(e.target)
    };

    return (
        <div>
            <nav>
                <div id='marker'></div>
                <a href=" " onClick={onClickHandeler}>Home</a>
                <a href=" " onClick={onClickHandeler}>Home</a>
                <a href=" " onClick={onClickHandeler}>Home</a>
                <a href=" " onClick={onClickHandeler}>Home</a>
                <a href=" " onClick={onClickHandeler}>Home</a>
                <a href=" " onClick={onClickHandeler}>Home</a>
            </nav>
        </div>
    );
}

export default SlidingNav;
