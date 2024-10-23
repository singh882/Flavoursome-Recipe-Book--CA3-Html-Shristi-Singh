document.addEventListener('DOMContentLoaded', function() {
    const notification = document.getElementById('cookie-notification');
    
    // Show notification
    notification.classList.add('active');

    document.getElementById('accept-cookies').addEventListener('click', function() {
        notification.classList.remove('active');
    });
});