// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.tensor_shape

import com.google.protobuf.descriptor.FileDescriptorProto

object TensorShapeProtoCompanion extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      org.tensorflow.framework.tensor_shape.TensorShapeProto
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChJ0ZW5zb3Jfc2hhcGUucHJvdG8SCnRlbnNvcmZsb3ciygEKEFRlbnNvclNoYXBlUHJvdG8SPAoDZGltGAIgAygLMiAudGVuc
  29yZmxvdy5UZW5zb3JTaGFwZVByb3RvLkRpbUII4j8FEgNkaW1SA2RpbRIzCgx1bmtub3duX3JhbmsYAyABKAhCEOI/DRILdW5rb
  m93blJhbmtSC3Vua25vd25SYW5rGkMKA0RpbRIdCgRzaXplGAEgASgDQgniPwYSBHNpemVSBHNpemUSHQoEbmFtZRgCIAEoCUIJ4
  j8GEgRuYW1lUgRuYW1lQnEKGG9yZy50ZW5zb3JmbG93LmZyYW1ld29ya0IRVGVuc29yU2hhcGVQcm90b3NQAVo9Z2l0aHViLmNvb
  S90ZW5zb3JmbG93L3RlbnNvcmZsb3cvdGVuc29yZmxvdy9nby9jb3JlL2ZyYW1ld29ya/gBAWIGcHJvdG8z"""
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