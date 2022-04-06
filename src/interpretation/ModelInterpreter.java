package interpretation;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import conference.Conference;
import conference.ConferencePackage;
import conference.Submission;

public class ModelInterpreter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelInterpreter loader = new ModelInterpreter();
        Conference myconf = loader.load();
        // Accessing the model information
        System.out.println(myconf.getName());
        System.out.println(myconf.getVenue());
        // Lets see what info the webpage has
        for (Iterator<Submission> iterator = myconf.getSubmissions().iterator(); iterator
                .hasNext();) {
            Submission sub = iterator.next();
            System.out.println("Title : " + sub.getTitle());
           
        }
    
	}
	public Conference load() {
        // Initialize the model
        ConferencePackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI("model/instances/myconf.flexmi.xmi"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Conference myconf = (Conference) resource.getContents().get(0);
        return myconf;
    }
}
