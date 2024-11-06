import React, {useState} from 'react'; 
import { AppRegistry } from 'react-native';
import {View, Text, TextInput, Button, StyleSheet} from 'react-native';

// função principal
const app = () =>{
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  // funcão quando o botão de login é presionado
  const handleLogin = () =>{
    alert(`Usuário:  ${username}\nSenha: ${password}`);
  };

  return (
    // container que centraliza o conteudo 
    <View style={styles.container}>
      <Text style={styles.title}>Tela de login</Text>
      < TextInput
      style = {styles.input}
      placeholder="Nome de usuario:"
      value= {username}
      onChangeText= {setUsername} // atualiza o estado do nome de usuario.
      />
      <TextInput
      style = {styles.input}
      placeholder="Senha:"
      secureTextEntry={true} // esconde senha
      value= {password}
      onChangeText= {setPassword} // atualiza o estado da senha
      />
      <Button title= "Entrar:" onPress={handleLogin}/>  {/* Botão de login */}
    </View>

  );

};

// definição de estilos

 const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#f5f5f5',
  },

  title: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 20,
  },

  input: {
    height: 40,
    borderColor: '#ccc',
    borderWidth: 1,
    marginBottom: 15,
    paddingHorizontal: 10,
    width: '80%',
  },
 });

 export default app;