// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.op_def

import com.google.protobuf.descriptor.FileDescriptorProto

object OpDefProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    org.tensorflow.framework.attr_value.AttrValueProto,
    org.tensorflow.framework.types.TypesProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      org.tensorflow.framework.op_def.OpDef,
      org.tensorflow.framework.op_def.OpDeprecation,
      org.tensorflow.framework.op_def.OpList
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CgxvcF9kZWYucHJvdG8SCnRlbnNvcmZsb3caEGF0dHJfdmFsdWUucHJvdG8aC3R5cGVzLnByb3RvIt8KCgVPcERlZhIdCgRuY
  W1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSRAoJaW5wdXRfYXJnGAIgAygLMhgudGVuc29yZmxvdy5PcERlZi5BcmdEZWZCDeI/C
  hIIaW5wdXRBcmdSCGlucHV0QXJnEkcKCm91dHB1dF9hcmcYAyADKAsyGC50ZW5zb3JmbG93Lk9wRGVmLkFyZ0RlZkIO4j8LEglvd
  XRwdXRBcmdSCW91dHB1dEFyZxI4CgRhdHRyGAQgAygLMhkudGVuc29yZmxvdy5PcERlZi5BdHRyRGVmQgniPwYSBGF0dHJSBGF0d
  HISTQoLZGVwcmVjYXRpb24YCCABKAsyGS50ZW5zb3JmbG93Lk9wRGVwcmVjYXRpb25CEOI/DRILZGVwcmVjYXRpb25SC2RlcHJlY
  2F0aW9uEiYKB3N1bW1hcnkYBSABKAlCDOI/CRIHc3VtbWFyeVIHc3VtbWFyeRIyCgtkZXNjcmlwdGlvbhgGIAEoCUIQ4j8NEgtkZ
  XNjcmlwdGlvblILZGVzY3JpcHRpb24SOQoOaXNfY29tbXV0YXRpdmUYEiABKAhCEuI/DxINaXNDb21tdXRhdGl2ZVINaXNDb21td
  XRhdGl2ZRIzCgxpc19hZ2dyZWdhdGUYECABKAhCEOI/DRILaXNBZ2dyZWdhdGVSC2lzQWdncmVnYXRlEjAKC2lzX3N0YXRlZnVsG
  BEgASgIQg/iPwwSCmlzU3RhdGVmdWxSCmlzU3RhdGVmdWwSWwoaYWxsb3dzX3VuaW5pdGlhbGl6ZWRfaW5wdXQYEyABKAhCHeI/G
  hIYYWxsb3dzVW5pbml0aWFsaXplZElucHV0UhhhbGxvd3NVbmluaXRpYWxpemVkSW5wdXQaygIKBkFyZ0RlZhIdCgRuYW1lGAEgA
  SgJQgniPwYSBG5hbWVSBG5hbWUSMgoLZGVzY3JpcHRpb24YAiABKAlCEOI/DRILZGVzY3JpcHRpb25SC2Rlc2NyaXB0aW9uEjMKB
  HR5cGUYAyABKA4yFC50ZW5zb3JmbG93LkRhdGFUeXBlQgniPwYSBHR5cGVSBHR5cGUSKgoJdHlwZV9hdHRyGAQgASgJQg3iPwoSC
  HR5cGVBdHRyUgh0eXBlQXR0chIwCgtudW1iZXJfYXR0chgFIAEoCUIP4j8MEgpudW1iZXJBdHRyUgpudW1iZXJBdHRyEjcKDnR5c
  GVfbGlzdF9hdHRyGAYgASgJQhHiPw4SDHR5cGVMaXN0QXR0clIMdHlwZUxpc3RBdHRyEiEKBmlzX3JlZhgQIAEoCEIK4j8HEgVpc
  1JlZlIFaXNSZWYa9gIKB0F0dHJEZWYSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEh0KBHR5cGUYAiABKAlCCeI/BhIEd
  HlwZVIEdHlwZRJNCg1kZWZhdWx0X3ZhbHVlGAMgASgLMhUudGVuc29yZmxvdy5BdHRyVmFsdWVCEeI/DhIMZGVmYXVsdFZhbHVlU
  gxkZWZhdWx0VmFsdWUSMgoLZGVzY3JpcHRpb24YBCABKAlCEOI/DRILZGVzY3JpcHRpb25SC2Rlc2NyaXB0aW9uEjAKC2hhc19ta
  W5pbXVtGAUgASgIQg/iPwwSCmhhc01pbmltdW1SCmhhc01pbmltdW0SJgoHbWluaW11bRgGIAEoA0IM4j8JEgdtaW5pbXVtUgdta
  W5pbXVtElAKDmFsbG93ZWRfdmFsdWVzGAcgASgLMhUudGVuc29yZmxvdy5BdHRyVmFsdWVCEuI/DxINYWxsb3dlZFZhbHVlc1INY
  Wxsb3dlZFZhbHVlcyJrCg1PcERlcHJlY2F0aW9uEiYKB3ZlcnNpb24YASABKAVCDOI/CRIHdmVyc2lvblIHdmVyc2lvbhIyCgtle
  HBsYW5hdGlvbhgCIAEoCUIQ4j8NEgtleHBsYW5hdGlvblILZXhwbGFuYXRpb24iNAoGT3BMaXN0EioKAm9wGAEgAygLMhEudGVuc
  29yZmxvdy5PcERlZkIH4j8EEgJvcFICb3BCawoYb3JnLnRlbnNvcmZsb3cuZnJhbWV3b3JrQgtPcERlZlByb3Rvc1ABWj1naXRod
  WIuY29tL3RlbnNvcmZsb3cvdGVuc29yZmxvdy90ZW5zb3JmbG93L2dvL2NvcmUvZnJhbWV3b3Jr+AEBYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      org.tensorflow.framework.attr_value.AttrValueProto.javaDescriptor,
      org.tensorflow.framework.types.TypesProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}