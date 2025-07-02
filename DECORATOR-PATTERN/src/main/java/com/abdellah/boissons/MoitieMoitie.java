package com.abdellah.boissons;

public class MoitieMoitie extends Boisson{

    public MoitieMoitie() {
        description = "Moitie moitie";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cout() {
        return 14;
    }
}
