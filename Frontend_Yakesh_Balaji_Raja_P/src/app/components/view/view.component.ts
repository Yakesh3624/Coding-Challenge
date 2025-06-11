import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from 'src/app/model/player.model';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  data:Player[]=[];
  pid!:number;

  constructor(private service:PlayerService,private router:Router) {}

  ngOnInit(): void {
    this.getAll();
    console.log(this.data);
  }

  getAll()
  {
    this.service.getAll().subscribe((players)=>this.data=players);
  }

  update(player:Player)
  {
      this.router.navigate(['/update']);
  }

  delete(id:number)
  {
      this.service.deletePlayer(id).subscribe((msg)=>console.log(msg));
      this.getAll();
  }

  filter(pid:number)
  {
    if(pid!=null)
    {
      this.service.getById(pid).subscribe((players)=>{this.data=[];this.data[0]=players;});
      console.log(this.data);
    }
    else{
      this.getAll();
    }
  }

}
