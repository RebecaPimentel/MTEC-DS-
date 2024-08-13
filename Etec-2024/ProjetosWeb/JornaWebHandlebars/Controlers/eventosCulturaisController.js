import { home } from "../models/home.js";
import { infos } from "../models/infos.js";
import { about } from "../models/about.js";
import { gallery } from "../models/gallery.js";
import { publi } from "../models/publi.js";
import { testimonials } from "../models/testimonials.js";

export const getEventosCulturaisPage = (req, res) => {
  const positEVENT = 3;
  res.render("eventosCulturais", {
    home: home[positEVENT], 
    info: infos[positEVENT], 
    about: about[positEVENT], 
    gallery: gallery[positEVENT], 
    publi: publi[positEVENT], 
    testimonials: testimonials[positEVENT]
  });
};
