// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.op_def

/** Information about version-dependent deprecation of an op
  *
  * @param version
  *   First GraphDef version at which the op is disallowed.
  * @param explanation
  *   Explanation of why it was deprecated and what to use instead.
  */
@SerialVersionUID(0L)
final case class OpDeprecation(
    version: _root_.scala.Int = 0,
    explanation: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[OpDeprecation] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = version
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = explanation
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = version
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = explanation
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withVersion(__v: _root_.scala.Int): OpDeprecation = copy(version = __v)
    def withExplanation(__v: _root_.scala.Predef.String): OpDeprecation = copy(explanation = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = version
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = explanation
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(version)
        case 2 => _root_.scalapb.descriptors.PString(explanation)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.op_def.OpDeprecation
    // @@protoc_insertion_point(GeneratedMessage[tensorflow.OpDeprecation])
}

object OpDeprecation extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.op_def.OpDeprecation] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.op_def.OpDeprecation] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.op_def.OpDeprecation = {
    var __version: _root_.scala.Int = 0
    var __explanation: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __version = _input__.readInt32()
        case 18 =>
          __explanation = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    org.tensorflow.framework.op_def.OpDeprecation(
        version = __version,
        explanation = __explanation,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.op_def.OpDeprecation] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.op_def.OpDeprecation(
        version = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        explanation = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = OpDefProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = OpDefProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.framework.op_def.OpDeprecation(
    version = 0,
    explanation = ""
  )
  implicit class OpDeprecationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.op_def.OpDeprecation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.op_def.OpDeprecation](_l) {
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def explanation: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.explanation)((c_, f_) => c_.copy(explanation = f_))
  }
  final val VERSION_FIELD_NUMBER = 1
  final val EXPLANATION_FIELD_NUMBER = 2
  def of(
    version: _root_.scala.Int,
    explanation: _root_.scala.Predef.String
  ): _root_.org.tensorflow.framework.op_def.OpDeprecation = _root_.org.tensorflow.framework.op_def.OpDeprecation(
    version,
    explanation
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[tensorflow.OpDeprecation])
}