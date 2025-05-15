import express from 'express';  

const app = express();  

// Midlleware para analisar o corpo das requisições como JSON
app.use(express.json());
// Middleware para registrar as requisições
app.use((req, res, next) => {  
  console.log(`Requisição: ${req.method} ${req.url}`);  
  next();  
});

app.get('/', (req, res) => {  
  res.send('Olá, mundo. Esta é a API do meu projeto simples em Express');  
});  

// Define uma porta padrão, ou use a do ambiente  
const port = process.env.PORT || 3000;  

app.listen(port, () => {  
  console.log(`Servidor rodando na porta ${port}`);  
});  

export default app;