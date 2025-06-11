import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../model/player.model';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http:HttpClient) { }

  baseLink:string="http://localhost:8080/api/"
  getAll():Observable<Player[]>
  {
    return this.http.get<Player[]>(this.baseLink+"players")
  }

  addPlayer(player:Player):Observable<Player>
  {
    console.log("Player added");
    console.log(player);
    alert("Player added");
      return this.http.post<Player>(this.baseLink+"players",player);
  }

  deletePlayer(id:number)
  {
    alert("Player deleted")
    return this.http.delete(this.baseLink+"players/"+id)
  }

  updatePlayer(player:Player)
  {
      alert("Player updated")
      return this.http.put<Player>(this.baseLink+"players",player);
  }

  getById(id:number)
  {
    return this.http.get<Player>(this.baseLink+"players/"+id);
  }
}
