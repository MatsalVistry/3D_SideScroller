using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Movement : MonoBehaviour {
    public double speed;
    public bool jumping;
    private double i = 0.0;
    public float jumpspeed = 0.1f;
    public Vector3 initialvelocity;
    
     Rigidbody rb ;
    public float distToGround = 0.5f;
	// Use this for initialization
	void Start () {
        rb = GetComponent<Rigidbody>();
       
	}
	
	// Update is called once per frame
	void Update () {
        if (i >= 1.0)
        {
            Vector3 initial = new Vector3(0, jumpspeed, 0);
            rb.velocity = rb.velocity - initial;
          
        }
        if (Input.GetKey(KeyCode.Space) & IsGrounded()){
            // rb.AddForce(Vector3.up * 3);
         
            Vector3 jumpVelocity = new Vector3(0, jumpspeed, 0);
          
            rb.velocity = rb.velocity + jumpVelocity;
            
            jumping = true;
        }

        if (Input.GetKey("space") & IsGrounded())
        {
            print("dfa");
        }
      
            transform.Translate(0, 0, Time.deltaTime +0.03f);

    }  
  bool IsGrounded()
    {
        return Physics.Raycast(transform.position, Vector3.down, distToGround);  
            }
}
