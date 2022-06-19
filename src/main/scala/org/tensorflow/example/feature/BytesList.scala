// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.example.feature

/** Containers to hold repeated fundamental values.
  */
@SerialVersionUID(0L)
final case class BytesList(
    value: _root_.scala.Seq[_root_.com.google.protobuf.ByteString] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[BytesList] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      value.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, __value)
      }
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
      value.foreach { __v =>
        val __m = __v
        _output__.writeBytes(1, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearValue = copy(value = _root_.scala.Seq.empty)
    def addValue(__vs: _root_.com.google.protobuf.ByteString*): BytesList = addAllValue(__vs)
    def addAllValue(__vs: Iterable[_root_.com.google.protobuf.ByteString]): BytesList = copy(value = value ++ __vs)
    def withValue(__v: _root_.scala.Seq[_root_.com.google.protobuf.ByteString]): BytesList = copy(value = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => value
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(value.iterator.map(_root_.scalapb.descriptors.PByteString(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.example.feature.BytesList
    // @@protoc_insertion_point(GeneratedMessage[tensorflow.BytesList])
}

object BytesList extends scalapb.GeneratedMessageCompanion[org.tensorflow.example.feature.BytesList] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.example.feature.BytesList] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.example.feature.BytesList = {
    val __value: _root_.scala.collection.immutable.VectorBuilder[_root_.com.google.protobuf.ByteString] = new _root_.scala.collection.immutable.VectorBuilder[_root_.com.google.protobuf.ByteString]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __value += _input__.readBytes()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    org.tensorflow.example.feature.BytesList(
        value = __value.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.example.feature.BytesList] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.example.feature.BytesList(
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.com.google.protobuf.ByteString]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = FeatureProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = FeatureProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.example.feature.BytesList(
    value = _root_.scala.Seq.empty
  )
  implicit class BytesListLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.example.feature.BytesList]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.example.feature.BytesList](_l) {
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.com.google.protobuf.ByteString]] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
  def of(
    value: _root_.scala.Seq[_root_.com.google.protobuf.ByteString]
  ): _root_.org.tensorflow.example.feature.BytesList = _root_.org.tensorflow.example.feature.BytesList(
    value
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[tensorflow.BytesList])
}
