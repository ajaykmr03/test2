<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

  <title>Ajaykumar Portfolio</title>
  <style>
           * {
            margin: 0;
            padding: 0;
            font-family: 'Poppins', sans-serif;
            box-sizing: border-box;
            
  scroll-behavior: smooth;
}

        

       body {
    background: linear-gradient(-45deg, #000000, #1a1a1a, #0a0a0a, #000000);
    background-size: 400% 400%;
    animation: gradientBG 20s ease infinite;
    color: white;
}

@keyframes gradientBG {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}
body::before {
    content: "";
    position: fixed;
    width: 100%;
    height: 100%;
    background-image: radial-gradient(#007BFF 1px, transparent 1px);
    background-size: 20px 20px;
    animation: moveDots 30s linear infinite;
    z-index: -1;
    opacity: 0.1;
}

@keyframes moveDots {
    from {
        background-position: 0 0;
    }
    to {
        background-position: 1000px 1000px;
    }
}


        .container {
            padding: 10px 10px;
            max-width: 1200px;
            margin: auto;
        }

        nav {
            display: flex;
            align-items: center;
            justify-content: space-between;
            flex-wrap: wrap;
        }

        .logo {
            width: 160px;
        }

        nav ul li {
            display: inline-block;
            list-style: none;
            margin: 10px 20px;
        }

        nav ul li a {
            color: #fff;
            text-decoration: none;
            font-size: 18px;
            position: relative;
        }

        nav ul li a::after {
            content: "";
            width: 0%;
            height: 3px;
            background: #0056b3;
            position: absolute;
            left: 0;
            bottom: -6px;
            transition: 0.5s;
        }
        nav ul li a:hover::after{
            width: 100%;
        } 
   /* Clean full-screen header */
/* Add animation classes */
@keyframes fadeInUp {
    from {
        opacity: 0;
        transform: translateY(30px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

@keyframes slideDown {
    from {
        opacity: 0;
        transform: translateY(-40px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

@keyframes backgroundPulse {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

/* Background animation */
#header {
    height: 100vh;
    background-color: black;
    background-size: 300% 300%;
    animation: backgroundPulse 20s ease infinite;
    color: white;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    padding: 0 40px;
    position: relative;
    overflow: hidden;
}
     .sub-title {
              background-color: black;
    background-size: 300% 300%;
    animation: backgroundPulse 20s ease infinite;
            text-align: center;
            font-size: 40px;
            font-weight: 600;
            margin-top: 80px;
            color: #fff;
              animation: slideDown 1s ease forwards;
    opacity: 0; 
       animation: fadeInUp 1.5s ease-out 0.5s forwards;
 
        }

/* Navbar animation */
.navbar {
    animation: slideDown 1s ease forwards;
    opacity: 0; /* So it fades in */
}

/* Navbar hover effects */
.nav-links li a {
    text-decoration: none;
    color: white;
    font-size: 16px;
    transition: all 0.3s ease;
}

.nav-links li a:hover {
    color: #00d9ff;
    transform: scale(1.05);
}

/* Hero animations */
.hero-content {
    flex: 1;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    text-align: center;
    margin-top: -80px;
    opacity: 0;
    animation: fadeInUp 1.5s ease-out 0.5s forwards;
  
}

.hero-content h1 {
    font-size: 64px;
    margin-bottom: 20px;
    opacity: 0;
    animation: fadeInUp 1.5s ease-out 0.8s forwards;
    animation-delay: 0.8s;
}

.hero-content h1 span {
    color: #007BFF;
    text-wrap:nowrap;
    overflow: hidden;
    
}

.hero-content p {
    font-size: 22px;
    max-width: 600px;
    color: #ddd;
    opacity: 0;
    animation: fadeInUp 1.5s ease-out 1.2s forwards;
}

/* Scroll down bounce */
 @keyframes fadeInAbout {
        from {
            opacity: 0;
            transform: translateY(30px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

   #about {
    padding: 80px 0;
    padding-top: 20%;
    opacity: 0;
    transform: translateY(30px);
    transition: opacity 1.5s ease, transform 1.5s ease;
}

.about-col-1 img {
    width: 70%;
    border-radius: 60px;
    margin-left: 70px;
    opacity: 0;
    transform: translateY(30px);
    transition: opacity 1.5s ease 0.3s, transform 1.5s ease 0.3s;
}

.about-col-2 {
    flex-basis: 60%;
    padding-left: 30px;
    opacity: 0;
    transform: translateY(30px);
    transition: opacity 1.5s ease 0.6s, transform 1.5s ease 0.6s;
}

.tab-links {
    opacity: 0;
    transform: translateY(20px);
    transition: opacity 1.2s ease 1s, transform 1.2s ease 1s;
}

.tab-contents {
    opacity: 0;
    transform: translateY(20px);
    transition: opacity 1.2s ease 1.2s, transform 1.2s ease 1.2s;
}

        .row {
            display: flex;
            flex-wrap: wrap;
        }

        .about-col-1 {
            flex-basis: 35%;
        }

        .about-col-1 img {
            width: 70%;
            border-radius: 60px;
            margin-left: 70px;
        }

        .about-col-2 {
            flex-basis: 60%;
            padding-left: 30px;
        }

        .sub {
            font-weight: 600;
            font-size: 40px;
            color: white;
        }

        .about-col-2 p {
            margin-top: 20px;
            line-height: 1.6;
        }

        .tab-titles {
            display: flex;
            margin: 20px 0 40px;
        }

        .tab-links {
            margin-right: 50px;
            font-size: 18px;
            font-weight: 500;
            cursor: pointer;
            position: relative;
        }

        .tab-links::after {
            content: '';
            width: 0;
            height: 3px;
            background: #007BFF;
            position: absolute;
            left: 0;
            bottom: -8px;
            transition: 0.5s;
        }

        .tab-links.active-link::after {
            width: 50%;
        }

        .tab-contents ul li {
            list-style: none;
            margin: 10px 0;
        }

        .tab-contents ul li span {
            color: #007BFF;
            font-size: 14px;
        }

        .tab-contents {
            display: none;
        }

        .tab-contents.active-tab {
            display: block;
        }

   

        .services-list {
            
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
            gap: 30px;
            margin-top: 50px;
            padding: 0 20px;
        }

        .services-list div {
            background: #1a1a1a;
            padding: 25px;
            border-radius: 20px;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            box-shadow: 0 0 10px rgba(0, 123, 255, 0.2);
        }

        .services-list div:hover {
            transform: translateY(-10px);
            box-shadow: 0 0 20px rgba(0, 123, 255, 0.4);
        }

        .services-list h2 {
            font-size: 24px;
            color: #007BFF;
            margin-bottom: 15px;
        }

        .services-list p {
            font-size: 16px;
            line-height: 1.6;
            color: #ccc;
        }

        #portfolio {
            padding: 80px 20px;
            background: #0a0a0a;
        }

        #portfolio .container {
            max-width: 1200px;
            margin: 0 auto;
            text-align: center;
        }

        .card-row {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 40px;
            margin-top: 40px;
            padding: 0 20px;
        }

        .card {
            width: 200px;
            height: 320px;
            position: relative;
            display: flex;
            justify-content: center;
            align-items: flex-end;
            perspective: 2500px;
            border-radius: 10px;
        }

        .cover-image {
            width: 100%;
            height: 100%;
            object-fit: cover;
            border-radius: 10px;
        }

        .wrapper {
            transition: all 0.5s;
            position: absolute;
            width: 100%;
            height: 100%;
            z-index: -1;
            border-radius: 10px;
        }

        .card:hover .wrapper {
            transform: perspective(900px) translateY(-5%) rotateX(25deg);
            box-shadow: 2px 35px 32px -8px rgba(0, 123, 255, 0.75);
        }

        .wrapper::before,
        .wrapper::after {
            content: "";
            opacity: 0;
            width: 100%;
            height: 80px;
            transition: all 0.5s;
            position: absolute;
            left: 0;
            border-radius: 10px;
        }

        .wrapper::before {
            top: 0;
            height: 100%;
            background-image: linear-gradient(to top, transparent 46%, rgba(12, 13, 19, 0.5) 68%, rgba(12, 13, 19) 97%);
        }

        .wrapper::after {
            bottom: 0;
            opacity: 1;
            background-image: linear-gradient(to bottom, transparent 46%, rgba(12, 13, 19, 0.5) 68%, rgba(12, 13, 19) 97%);
        }

        .card:hover .wrapper::before,
        .card:hover .wrapper::after {
            opacity: 1;
        }

        .card:hover .wrapper::after {
            height: 120px;
        }

        .title {
            width: 100%;
            transition: transform 0.5s;
        }

        .card:hover .title {
            transform: translate3d(0%, -50px, 100px);
        }

        .character {
            width: 100%;
            opacity: 0;
            transition: all 0.5s;
            position: absolute;
            z-index: -1;
        }

        .card:hover .character {
            opacity: 1;
            transform: translate3d(0%, -30%, 100px);
        }

        form input, form textarea {
            width: 100%;
            padding: 12px;
            margin-bottom: 10px;
            border: none;
            border-radius: 8px;
            background-color: #333;
            color: white;
            font-size: 16px;
        }

        form button {
            background-color: #007BFF;
            color: white;
            padding: 10px 25px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 10px;
            transition: background 0.3s ease;
        }

        form button:hover {
            background-color: #0056b3;
        }

        #contact a {
            display: inline-block;
            margin-right: 15px;
            color: #007BFF;
            text-decoration: none;
            font-weight: 500;
            transition: color 0.3s;
        }

        #contact a:hover {
            color: #00bfff;
        }
  </style>
</head>
<body>

  <!-- Header -->
  <header id="header">
    <nav class="navbar">
        <img src="./img/nme.png" class="logo">
      <ul>
        <li><a href="#about">About</a></li>
        <li><a href="#services">Services</a></li>
        <li><a href="#portfolio">Portfolio</a></li>
        <li><a href="#contact">Contact</a></li>
      </ul>
    </nav>

    <div class="hero-content">
      <h1>Hi, I'm <span>Ajaykumar</span></h1>
      <p>A passionate <strong>Web Developer</strong> from Tamil Nadu</p>
    </div>
  </header>

  <!-- About Section -->
  <div id="about">
    <div class="container">
      <div class="row">
        <div class="about-col-1">
          <img src="./img/imak.jpg" alt="Ajaykumar">
        </div>
        <div class="about-col-2">
          <h1 class="sub">About Me</h1>
          <p>Hi, I’m Ajaykumar — a passionate web developer...</p>

          <div class="tab-titles">
            <p class="tab-links active-link" onclick="opentab(event, 'skills')">Skills</p>
            <p class="tab-links" onclick="opentab(event, 'Experience')">Experience</p>
            <p class="tab-links" onclick="opentab(event, 'Education')">Education</p>
          </div>

          <div class="tab-contents active-tab" id="skills">
            <ul>
              <li><span>UI/UX</span><br>Designing Web/App Interfaces</li>
              <li><span>Web Development</span><br>Web App Development</li>
              <li><span>App Development</span><br>Building Android/iOS apps</li>
            </ul>
          </div>

          <div class="tab-contents" id="Experience">
            <ul>
              <li><span>Web Development</span><br>Internship at Techvolt Software Pvt Ltd...</li>
            </ul>
          </div>

          <div class="tab-contents" id="Education">
            <ul>
              <li><span>MCA</span><br>Kalasalingam, Srivilliputhur</li>
              <li><span>BCA</span><br>NGP, Coimbatore</li>
            </ul>
          </div>

        </div>
      </div>
    </div>
  </div>
<!-- Services Section -->
<div id="services">
  <div class="container">
    <h1 class="sub-title">My Services</h1>
    <div class="services-list">
      <div>
        <h2>Web Design</h2>
        <p>Beautiful and responsive UI/UX designs...</p>
      </div>
      <div>
        <h2>Development</h2>
        <p>Web applications, portals, and more...</p>
      </div>
    </div>
  </div>
</div>

  <!-- Portfolio -->
  <div id="portfolio">
    <div class="container">
      <h1 class="sub-title">My Work</h1>
      <div class="card-row">
        <a href="#"><div class="card"><div class="wrapper"><img src="./img/dark_rider-cover.png" class="cover-image" /></div><img src="./img/dark_rider-title.png" class="title"/><img src="./img/dark_rider-character.png" class="character"/></div></a>
        <a href="#"><div class="card"><div class="wrapper"><img src="./img/force_mage-cover.png" class="cover-image" /></div><img src="./img/force_mage-title.png" class="title"/><img src="./img/force_mage-character.png" class="character"/></div></a>
      </div>
    </div>
  </div>

  <!-- Contact Section -->
  <div id="contact">
    <div class="container">
      <h1 class="sub-title">Contact Me</h1>
      <div style="display: flex; flex-wrap: wrap; gap: 30px; margin-top: 40px;">
        <div style="flex: 1; min-width: 250px;">
          <p><strong style="color: #007BFF;">Email:</strong> ajikmr0308@gmail.com</p>
          <p><strong style="color: #007BFF;">Phone:</strong> +91-7010063995</p>
          <p><strong style="color: #007BFF;">Location:</strong> Tamil Nadu, India</p>
        <div style="margin-top: 20px;">
 
  <a href="https://www.instagram.com/im_a.k._k.m.r_?igsh=N3ltMXJtaDlybnNr&utm_source=qr" target="_blank">
    <i class="fab fa-instagram"></i>
  </a>
</div>

        </div>

        <form action="Sendemail"method="Post">
          <input type="text" name="name" placeholder="Your Name" required>
          <input type="email" name="email" placeholder="Your Email" required>
          <textarea name="message" placeholder="Your Message" rows="5" required></textarea>
          <button type="submit">Send</button>
        </form>
      </div>
    </div>
  </div>

  <!-- Scripts -->
  <script>
    // Tab functionality
    function opentab(event, tabname) {
      const tablinks = document.getElementsByClassName("tab-links");
      const tabcontents = document.getElementsByClassName("tab-contents");

      for (let tablink of tablinks) {
        tablink.classList.remove("active-link");
      }

      for (let tabcontent of tabcontents) {
        tabcontent.classList.remove("active-tab");
      }

      event.currentTarget.classList.add("active-link");
      document.getElementById(tabname).classList.add("active-tab");
    }

    // Run after DOM content is loaded
    document.addEventListener("DOMContentLoaded", function () {
      const aboutSection = document.getElementById("about");
      if (!aboutSection) return;

      const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
          if (entry.isIntersecting) {
            const image = document.querySelector('.about-col-1 img');
            const text = document.querySelector('.about-col-2');
            const tabLinks = document.querySelectorAll('.tab-links');
            const tabContents = document.querySelectorAll('.tab-contents');

            aboutSection.style.opacity = '1';
            aboutSection.style.transform = 'translateY(0)';
            if (image) {
              image.style.opacity = '1';
              image.style.transform = 'translateY(0)';
            }
            if (text) {
              text.style.opacity = '1';
              text.style.transform = 'translateY(0)';
            }

            tabLinks.forEach(link => {
              link.style.opacity = '1';
              link.style.transform = 'translateY(0)';
            });

            tabContents.forEach(tab => {
              tab.style.opacity = '1';
              tab.style.transform = 'translateY(0)';
            });

            observer.unobserve(entry.target);
          }
        });
      }, {
        threshold: 0.3
      });

      observer.observe(aboutSection);
    });
  </script>

</body>
</html>
