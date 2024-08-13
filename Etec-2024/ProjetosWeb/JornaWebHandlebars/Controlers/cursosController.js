import { home } from "../models/home.js";
import { infos } from "../models/infos.js";
import { about } from "../models/about.js";
import { gallery } from "../models/gallery.js";
import { publi } from "../models/publi.js";
import { testimonials } from "../models/testimonials.js";

export const getCursosPage = (req, res) => {
  const positCURS = 4;
  res.render("cursos", {
    home: home[positCURS], 
    info: infos[positCURS], 
    about: about[positCURS], 
    gallery: gallery[positCURS], 
    publi: publi[positCURS], 
    testimonials: testimonials[positCURS]
  });
};
