const stars = document.querySelectorAll('.star');
const ratingValue = document.getElementById('rating-value');

stars.forEach(star => {
    star.addEventListener('click', () => {
        const value = star.getAttribute('data-value');

        // Clear previous selections
        stars.forEach(s => s.classList.remove('selected'));

        // Highlight selected stars
        for (let i = 0; i < value; i++) {
            stars[i].classList.add('selected');
        }

        // Update the rating value display
        ratingValue.textContent = value;
    });
});