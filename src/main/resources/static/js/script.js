// script.js
document.addEventListener('DOMContentLoaded', () => {
    const heroH1 = document.querySelector('.hero h1');
    const hours = new Date().getHours();
    const greeting = hours < 12 ? 'Good Morning' : hours < 18 ? 'Good Afternoon' : 'Good Evening';
    heroH1.textContent = `${greeting}, Welcome to the World of Adventure`;
});
