export class Hello {
  constructor() {
    this.name = 'Külastaja';
  }

  configureRouter(config, router){
  	this.router = router;
  	config.title = 'Disc golfi veebirakendus';
  	config.map({
  		{ route: ['', 'home'], name: 'home', moduleId:'home/index'}
  	});
  }
}
