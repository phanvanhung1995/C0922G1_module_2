package casestudy.services;

import casestudy.model.faccility.Facility;

import java.io.IOException;

public interface IFacilityService {
    public void Maintenance();

    public void addFacility(Facility o , int count) throws IOException;


}
