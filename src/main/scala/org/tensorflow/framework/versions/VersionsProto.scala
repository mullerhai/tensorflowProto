// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.versions

import com.google.protobuf.descriptor.FileDescriptorProto

object VersionsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      org.tensorflow.framework.versions.VersionDef
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg52ZXJzaW9ucy5wcm90bxIKdGVuc29yZmxvdyKkAQoKVmVyc2lvbkRlZhIpCghwcm9kdWNlchgBIAEoBUIN4j8KEghwcm9kd
  WNlclIIcHJvZHVjZXISMwoMbWluX2NvbnN1bWVyGAIgASgFQhDiPw0SC21pbkNvbnN1bWVyUgttaW5Db25zdW1lchI2Cg1iYWRfY
  29uc3VtZXJzGAMgAygFQhHiPw4SDGJhZENvbnN1bWVyc1IMYmFkQ29uc3VtZXJzQm4KGG9yZy50ZW5zb3JmbG93LmZyYW1ld29ya
  0IOVmVyc2lvbnNQcm90b3NQAVo9Z2l0aHViLmNvbS90ZW5zb3JmbG93L3RlbnNvcmZsb3cvdGVuc29yZmxvdy9nby9jb3JlL2ZyY
  W1ld29ya/gBAWIGcHJvdG8z"""
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