/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class port_mapping_t_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected port_mapping_t_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(port_mapping_t_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_port_mapping_t_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public port_mapping_t_vector() {
    this(libtorrent_jni.new_port_mapping_t_vector(), true);
  }

  public long size() {
    return libtorrent_jni.port_mapping_t_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.port_mapping_t_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.port_mapping_t_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.port_mapping_t_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.port_mapping_t_vector_clear(swigCPtr, this);
  }

  public void push_back(int x) {
    libtorrent_jni.port_mapping_t_vector_push_back(swigCPtr, this, x);
  }

  public int get(int i) {
    return libtorrent_jni.port_mapping_t_vector_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    libtorrent_jni.port_mapping_t_vector_set(swigCPtr, this, i, val);
  }

}
