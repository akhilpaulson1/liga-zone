# ⚽ Liga Player Search App

A modern, full-stack web application for searching and filtering football player data with a UI design.

![React](https://img.shields.io/badge/React-18.2.0-61DAFB?style=flat&logo=react&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7+-6DB33F?style=flat&logo=springboot&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-F7DF1E?style=flat&logo=javascript&logoColor=black)
![CSS3](https://img.shields.io/badge/CSS3-Animations-1572B6?style=flat&logo=css3&logoColor=white)

## 🚀 Features

- **Real-time Search**: Filter players by name, squad, and nationality instantly
- **Modern UI**: Glassmorphism design with smooth animations and gradient effects
- **Responsive Design**: Optimized for desktop, tablet, and mobile devices
- **RESTful API**: Spring Boot backend with dynamic query parameters
- **Interactive Dashboard**: Beautiful player cards with comprehensive statistics
- **Error Handling**: Robust error management with user-friendly feedback

## 🛠️ Tech Stack

### Frontend
- **React.js** - Component-based UI library
- **CSS** - Modern styling with animations and glassmorphism effects
- **JavaScript ** - Async/await patterns and modern syntax
- **Responsive Design** - Mobile-first approach

### Backend
- **Spring Boot** - RESTful API framework
- **Java** - Backend programming language
- **REST API** - HTTP endpoints for data retrieval

### Development Tools
- **Node.js & npm** - Package management
- **Create React App** - Development environment
- **Git** - Version control

## 📦 Installation & Setup

### Prerequisites
- Node.js (v14 or higher)
- Java 8+ and Maven
- Git

### Backend Setup (Spring Boot)
```bash
# Clone the repository
git clone https://github.com/akhilpaulson1/liga-zone.git
cd liga-player-search-app/backend

# Run the Spring Boot application
mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

### Frontend Setup (React)
```bash
# Navigate to frontend directory
cd ../frontend

# Install dependencies
npm install

# Start the development server
npm start
```

The frontend will start on `http://localhost:3000`

## 🎯 Usage

1. **Search Players**: Use the search bar to find players by name
2. **Filter by Squad**: Select a specific team from the dropdown
3. **Filter by Nation**: Choose a country to filter players
4. **Clear Filters**: Reset all filters with one click
5. **Refresh Data**: Reload player data from the API

## 📁 Project Structure

```
liga-player-search-app/
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── App.js          # Main React component
│   │   ├── App.css         # Styling and animations
│   │   └── index.js        # React entry point
│   ├── package.json        # Dependencies and scripts
│   └── README.md
├── backend/
│   ├── src/main/java/
│   │   └── com/akhil/
│   │       ├── controller/ # REST controllers
│   │       ├── model/      # Data models
│   │       └── service/    # Business logic
│   ├── pom.xml            # Maven dependencies
│   └── README.md
└── README.md              # This file
```

## 🔌 API Endpoints

### Get All Players
```http
GET /api/v1/player
```

### Filter Players (Query Parameters)
```http
GET /api/v1/player?squad=Barcelona&name=Messi&nation=Argentina
```

### Response Format
```json
[
  {
    "id": 1,
    "name": "Player Name",
    "squad": "Team Name",
    "nation": "Country",
    "pos": "Position",
    "age": 25,
    "gls": 15,
    "number": 10
  }
]
```

## 🎨 UI Features

- **Glassmorphism Design**: Modern transparent elements with blur effects
- **Smooth Animations**: CSS keyframes and transitions
- **Responsive Grid**: Adaptive layout for all screen sizes
- **Interactive Cards**: Hover effects and micro-animations
- **Loading States**: User feedback during data fetching
- **Error Handling**: Graceful error messages and fallback UI

## 🐛 Troubleshooting

### CORS Issues
If you encounter CORS errors, ensure the proxy is configured in `package.json`:
```json
{
  "proxy": "http://localhost:8080"
}
```

### Port Conflicts
- Backend runs on port 8080
- Frontend runs on port 3000
- Make sure both ports are available

### API Connection
Verify the backend is running by visiting: `http://localhost:8080/api/v1/player`




## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Akhil Paulson**
