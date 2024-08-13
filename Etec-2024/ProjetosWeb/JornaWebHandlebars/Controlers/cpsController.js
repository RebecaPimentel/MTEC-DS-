import { home } from "../models/home.js";
import { infos } from "../models/infos.js";
import { about } from "../models/about.js";
import { gallery } from "../models/gallery.js";
import { publi } from "../models/publi.js";
import { testimonials } from "../models/testimonials.js";

export const getCpsPage = (req, res) => {
  const positCPS = 0;
  res.render("cps", {
    home: home[positCPS], 
    info: infos[positCPS], 
    about: about[positCPS], 
    gallery: gallery[positCPS], 
    publi: publi[positCPS], 
    testimonials: testimonials[positCPS]
  });
};
