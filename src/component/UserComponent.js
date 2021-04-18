import React from 'react';
import UserService from '../services/UserService';
class UserComponent extends React.Component
{
constructor(props){
    super(props)
    this.state={
        Users:[]
    }
}

componentDidMount(){


    UserService.getUsers().then((response)=>{
        this.setState({Users:response.data})
    });
}




render()
{
    return(
        <div>
<h1 className="text-center">USER LIST</h1>
<table className="table table-stripped">
    <thead>
        <tr>
            <td> User Id</td>
            <td> User FirstName</td>
            <td> User LastName</td>
            <td> User EmaiId</td>
        </tr>
    </thead>
    <tbody>
        {
            this.state.Users.map(
                User=>
                <tr key={User.id}>
                    <td>{User.firstName}</td>
                    <td>{User.lastName}</td>
                    <td>{User.email}</td>
                     </tr>
            )
        }
    </tbody>
</table>



        </div>
    )
}
}
export default UserComponent