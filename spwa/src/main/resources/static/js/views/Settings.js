import AbstractView from "./AbstractView.js";

export default class extends AbstractView {
    constructor(params) {
        super(params);
        this.setTitle("Settings");
    }

    async getHtml() {
    	return (await fetch("http://localhost:8080/settings.html")).text();
    }
}