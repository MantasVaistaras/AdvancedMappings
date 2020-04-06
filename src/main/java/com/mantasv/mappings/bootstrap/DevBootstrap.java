package com.mantasv.mappings.bootstrap;

import com.mantasv.mappings.models.Instructor;
import com.mantasv.mappings.models.InstructorDetail;
import com.mantasv.mappings.repositories.InstructorDetailRepository;
import com.mantasv.mappings.repositories.InstructorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private InstructorRepository instructorRepository;
    private InstructorDetailRepository instructorDetailRepository;

    public DevBootstrap(InstructorRepository instructorRepository, InstructorDetailRepository instructorDetailRepository) {
        this.instructorRepository = instructorRepository;
        this.instructorDetailRepository = instructorDetailRepository;
    }

    private void initData() {
        /*saving*/
//        InstructorDetail instructorDetail = new InstructorDetail("Tai Lopez", "Marketing");
//        Instructor instructor = new Instructor("Tai", "Lopez", "tai@gmail.com",
//                instructorDetail);
//        instructorRepository.save(instructor);

        /*deleting the InstructorDetail but not cascading to the Instructor*/
//        InstructorDetail tempInstructorDetail = instructorDetailRepository.findById(6).get();
//        tempInstructorDetail.getInstructor().setInstructorDetail(null);
//        instructorDetailRepository.delete(tempInstructorDetail);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
}
