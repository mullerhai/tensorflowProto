// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.example.feature

import com.google.protobuf.descriptor.FileDescriptorProto

object FeatureProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      org.tensorflow.example.feature.BytesList,
      org.tensorflow.example.feature.FloatList,
      org.tensorflow.example.feature.Int64List,
      org.tensorflow.example.feature.Feature,
      org.tensorflow.example.feature.Features,
      org.tensorflow.example.feature.FeatureList,
      org.tensorflow.example.feature.FeatureLists
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg1mZWF0dXJlLnByb3RvEgp0ZW5zb3JmbG93Ii0KCUJ5dGVzTGlzdBIgCgV2YWx1ZRgBIAMoDEIK4j8HEgV2YWx1ZVIFdmFsd
  WUiLwoJRmxvYXRMaXN0EiIKBXZhbHVlGAEgAygCQgwQAeI/BxIFdmFsdWVSBXZhbHVlIi8KCUludDY0TGlzdBIiCgV2YWx1ZRgBI
  AMoA0IMEAHiPwcSBXZhbHVlUgV2YWx1ZSLpAQoHRmVhdHVyZRJGCgpieXRlc19saXN0GAEgASgLMhUudGVuc29yZmxvdy5CeXRlc
  0xpc3RCDuI/CxIJYnl0ZXNMaXN0SABSCWJ5dGVzTGlzdBJGCgpmbG9hdF9saXN0GAIgASgLMhUudGVuc29yZmxvdy5GbG9hdExpc
  3RCDuI/CxIJZmxvYXRMaXN0SABSCWZsb2F0TGlzdBJGCgppbnQ2NF9saXN0GAMgASgLMhUudGVuc29yZmxvdy5JbnQ2NExpc3RCD
  uI/CxIJaW50NjRMaXN0SABSCWludDY0TGlzdEIGCgRraW5kIrwBCghGZWF0dXJlcxJJCgdmZWF0dXJlGAEgAygLMiEudGVuc29yZ
  mxvdy5GZWF0dXJlcy5GZWF0dXJlRW50cnlCDOI/CRIHZmVhdHVyZVIHZmVhdHVyZRplCgxGZWF0dXJlRW50cnkSGgoDa2V5GAEgA
  SgJQgjiPwUSA2tleVIDa2V5EjUKBXZhbHVlGAIgASgLMhMudGVuc29yZmxvdy5GZWF0dXJlQgriPwcSBXZhbHVlUgV2YWx1ZToCO
  AEiSgoLRmVhdHVyZUxpc3QSOwoHZmVhdHVyZRgBIAMoCzITLnRlbnNvcmZsb3cuRmVhdHVyZUIM4j8JEgdmZWF0dXJlUgdmZWF0d
  XJlIt0BCgxGZWF0dXJlTGlzdHMSXgoMZmVhdHVyZV9saXN0GAEgAygLMikudGVuc29yZmxvdy5GZWF0dXJlTGlzdHMuRmVhdHVyZ
  Uxpc3RFbnRyeUIQ4j8NEgtmZWF0dXJlTGlzdFILZmVhdHVyZUxpc3QabQoQRmVhdHVyZUxpc3RFbnRyeRIaCgNrZXkYASABKAlCC
  OI/BRIDa2V5UgNrZXkSOQoFdmFsdWUYAiABKAsyFy50ZW5zb3JmbG93LkZlYXR1cmVMaXN0QgriPwcSBXZhbHVlUgV2YWx1ZToCO
  AFCaQoWb3JnLnRlbnNvcmZsb3cuZXhhbXBsZUINRmVhdHVyZVByb3Rvc1ABWjtnaXRodWIuY29tL3RlbnNvcmZsb3cvdGVuc29yZ
  mxvdy90ZW5zb3JmbG93L2dvL2NvcmUvZXhhbXBsZfgBAWIGcHJvdG8z"""
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