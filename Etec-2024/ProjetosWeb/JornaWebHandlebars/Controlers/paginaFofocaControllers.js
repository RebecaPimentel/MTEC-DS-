import { home } from "../models/home.js";
import { infos } from "../models/infos.js";
import { about } from "../models/about.js";
import { gallery } from "../models/gallery.js";
import { publi } from "../models/publi.js";
import { testimonials } from "../models/testimonials.js";

export const getPaginaFofocaPage = (req, res) => {
  const positFOF = 1;
  res.render("paginaFofoca", {
    home: home[positFOF], 
    info: infos[positFOF], 
    about: about[positFOF], 
    gallery: gallery[positFOF], 
    publi: publi[positFOF], 
    testimonials: testimonials[positFOF]
  });
};
