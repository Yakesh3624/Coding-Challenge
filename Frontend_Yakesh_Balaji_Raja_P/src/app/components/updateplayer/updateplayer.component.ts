import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';
import { Player } from 'src/app/model/player.model';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-updateplayer',
  templateUrl: './updateplayer.component.html',
  styleUrls: ['./updateplayer.component.css']
})
export class UpdateplayerComponent {

  constructor(private service:PlayerService, private router:Router){}

  update(data:Player)
  {
      this.service.updatePlayer(data).subscribe((msg)=>console.log(msg));
      this.router.navigate(['/view']);
  }

}
