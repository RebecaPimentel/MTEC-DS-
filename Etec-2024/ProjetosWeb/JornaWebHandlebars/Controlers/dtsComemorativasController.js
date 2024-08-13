import { home } from "../models/home.js";
import { infos } from "../models/infos.js";
import { about } from "../models/about.js";
import { gallery } from "../models/gallery.js";
import { publi } from "../models/publi.js";
import { testimonials } from "../models/testimonials.js";

export const getDtsComemorativasPage = (req, res) => {
  const positDTS = 2;
  res.render("dtsComemorativas", {
    home: home[positDTS], 
    info: infos[positDTS], 
    about: about[positDTS], 
    gallery: gallery[positDTS], 
    publi: publi[positDTS], 
    testimonials: testimonials[positDTS]
  });
};
