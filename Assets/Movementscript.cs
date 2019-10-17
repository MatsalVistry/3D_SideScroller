using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Movementscript : MonoBehaviour
{
    public bool onGround;
    private bool onObs;
    public Rigidbody rb2d;
    public float gravityScale = -10.0f;
    public static float globalGravity = -10f;
    Vector3 tempPos;
    // Use this for initialization
    void Start()
    {
        onGround = true;
        rb2d.GetComponent<Rigidbody>();
    }

    // Update is called once per frame
    void Update()
    { tempPos = transform.position;
            tempPos.z += .1f;
            transform.position = tempPos;
            
        
        if (onGround || onObs)
        {
         
            tempPos = transform.position;
            tempPos.z += .2f;
            transform.position = tempPos;
            
            if (Input.GetButtonDown("Jump"))
            {

                rb2d.velocity = new Vector3(0f, 10f, 0f);
                Vector3 gravity = globalGravity * gravityScale * Vector3.up;
                rb2d.AddForce(gravity, ForceMode.Acceleration);
                onGround = false;
                onObs = false;
                
            }
        }
    }
    void OnCollisionEnter(Collision other)
    {
        if (other.gameObject.CompareTag("groun"))
        {
            onGround = true;
            
        }
        if (other.gameObject.CompareTag("obstacle"))
        {
            onObs = true;
        }
        if(other.gameObject.CompareTag("Finish"))
        {
            transform.position = new Vector3(1.94f, 5.06f, -56.05f);
        }
    }


}
