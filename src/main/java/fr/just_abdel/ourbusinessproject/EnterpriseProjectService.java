package fr.just_abdel.ourbusinessproject;

import jakarta.persistence.EntityManager;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class EnterpriseProjectService {

    private final EntityManager entityManager;

    public EnterpriseProjectService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Create and persist a new project with the given title and description
     * @param aTitle
     * @param aDescription
     * @return
     */
    public Project newProject(String aTitle, String aDescription) {
        Project project = new Project();
        project.setTitle(aTitle);
        project.setDescription(aDescription);
        this.entityManager.persist(project);
        this.entityManager.flush();
        return project;
    }

    /**
     * Find a project by its id
     * @param id
     * @return
     */
    public Project findProjectById(Object id) {
        return entityManager.find(Project.class, id);
    }

    /**
     * Create and persist a new enterprise with the given parameters
     * @param aName
     * @param aDescription
     * @param aContactName
     * @param mail
     * @return
     */
    public Enterprise newEnterprise(String aName, String aDescription, String aContactName, String mail) {
        Enterprise enterprise = new Enterprise();
        enterprise.setName(aName);
        enterprise.setDescription(aDescription);
        enterprise.setContactName(aContactName);
        enterprise.setContactEmail(mail);
        this.entityManager.persist(enterprise);
        this.entityManager.flush();
        return enterprise;
    }

    /**
     * Find an enterprise by its id
     * @param anId
     * @return
     */
    public Enterprise findEnterpriseById(Long anId) {
        return entityManager.find(Enterprise.class, anId);
    }
}
