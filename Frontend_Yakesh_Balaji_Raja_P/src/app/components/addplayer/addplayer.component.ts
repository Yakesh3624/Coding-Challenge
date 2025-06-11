import { Component } from '@angular/core';
import { Player } from 'src/app/model/player.model';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrls: ['./addplayer.component.css']
})
export class AddplayerComponent {

  constructor(private service:PlayerService){}

  add(data:Player)
  {
      this.service.addPlayer(data).subscribe((msg)=>console.log(msg));
  }
}
