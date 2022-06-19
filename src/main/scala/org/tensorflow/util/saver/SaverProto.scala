package org.tensorflow.util.saver

import com.google.protobuf.descriptor.FileDescriptorProto

object SaverProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      org.tensorflow.util.saver.SaverDef
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
    scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
      """CgtzYXZlci5wcm90bxIKdGVuc29yZmxvdyKXBAoIU2F2ZXJEZWYSSQoUZmlsZW5hbWVfdGVuc29yX25hbWUYASABKAlCF+I/F
  BISZmlsZW5hbWVUZW5zb3JOYW1lUhJmaWxlbmFtZVRlbnNvck5hbWUSPQoQc2F2ZV90ZW5zb3JfbmFtZRgCIAEoCUIT4j8QEg5zY
  XZlVGVuc29yTmFtZVIOc2F2ZVRlbnNvck5hbWUSOgoPcmVzdG9yZV9vcF9uYW1lGAMgASgJQhLiPw8SDXJlc3RvcmVPcE5hbWVSD
  XJlc3RvcmVPcE5hbWUSLgoLbWF4X3RvX2tlZXAYBCABKAVCDuI/CxIJbWF4VG9LZWVwUgltYXhUb0tlZXASJgoHc2hhcmRlZBgFI
  AEoCEIM4j8JEgdzaGFyZGVkUgdzaGFyZGVkEmAKHWtlZXBfY2hlY2twb2ludF9ldmVyeV9uX2hvdXJzGAYgASgCQh7iPxsSGWtlZ
  XBDaGVja3BvaW50RXZlcnlOSG91cnNSGWtlZXBDaGVja3BvaW50RXZlcnlOSG91cnMSVAoHdmVyc2lvbhgHIAEoDjIsLnRlbnNvc
  mZsb3cuU2F2ZXJEZWYuQ2hlY2twb2ludEZvcm1hdFZlcnNpb25CDOI/CRIHdmVyc2lvblIHdmVyc2lvbiI1ChdDaGVja3BvaW50R
  m9ybWF0VmVyc2lvbhIKCgZMRUdBQ1kQABIGCgJWMRABEgYKAlYyEAJCZQoTb3JnLnRlbnNvcmZsb3cudXRpbEILU2F2ZXJQcm90b
  3NQAVo8Z2l0aHViLmNvbS90ZW5zb3JmbG93L3RlbnNvcmZsb3cvdGVuc29yZmxvdy9nby9jb3JlL3Byb3RvYnVm+AEBYgZwcm90b
  zM="""
    ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }

  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}
