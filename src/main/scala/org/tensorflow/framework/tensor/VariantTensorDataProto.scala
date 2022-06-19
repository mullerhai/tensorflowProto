// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.tensor

/** Protocol buffer representing the serialization format of DT_VARIANT tensors.
  *
  * @param typeName
  *   Name of the type of objects being serialized.
  * @param metadata
  *   Portions of the object that are not Tensors.
  * @param tensors
  *   Tensors contained within objects being serialized.
  */
@SerialVersionUID(0L)
final case class VariantTensorDataProto(
    typeName: _root_.scala.Predef.String = "",
    metadata: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    tensors: _root_.scala.Seq[org.tensorflow.framework.tensor.TensorProto] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[VariantTensorDataProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = typeName
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = metadata
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
        }
      };
      tensors.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      {
        val __v = typeName
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = metadata
        if (!__v.isEmpty) {
          _output__.writeBytes(2, __v)
        }
      };
      tensors.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withTypeName(__v: _root_.scala.Predef.String): VariantTensorDataProto = copy(typeName = __v)
    def withMetadata(__v: _root_.com.google.protobuf.ByteString): VariantTensorDataProto = copy(metadata = __v)
    def clearTensors = copy(tensors = _root_.scala.Seq.empty)
    def addTensors(__vs: org.tensorflow.framework.tensor.TensorProto*): VariantTensorDataProto = addAllTensors(__vs)
    def addAllTensors(__vs: Iterable[org.tensorflow.framework.tensor.TensorProto]): VariantTensorDataProto = copy(tensors = tensors ++ __vs)
    def withTensors(__v: _root_.scala.Seq[org.tensorflow.framework.tensor.TensorProto]): VariantTensorDataProto = copy(tensors = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = typeName
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = metadata
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 3 => tensors
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(typeName)
        case 2 => _root_.scalapb.descriptors.PByteString(metadata)
        case 3 => _root_.scalapb.descriptors.PRepeated(tensors.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.tensor.VariantTensorDataProto
    // @@protoc_insertion_point(GeneratedMessage[tensorflow.VariantTensorDataProto])
}

object VariantTensorDataProto extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.tensor.VariantTensorDataProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.tensor.VariantTensorDataProto] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.tensor.VariantTensorDataProto = {
    var __typeName: _root_.scala.Predef.String = ""
    var __metadata: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    val __tensors: _root_.scala.collection.immutable.VectorBuilder[org.tensorflow.framework.tensor.TensorProto] = new _root_.scala.collection.immutable.VectorBuilder[org.tensorflow.framework.tensor.TensorProto]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __typeName = _input__.readStringRequireUtf8()
        case 18 =>
          __metadata = _input__.readBytes()
        case 26 =>
          __tensors += _root_.scalapb.LiteParser.readMessage[org.tensorflow.framework.tensor.TensorProto](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    org.tensorflow.framework.tensor.VariantTensorDataProto(
        typeName = __typeName,
        metadata = __metadata,
        tensors = __tensors.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.tensor.VariantTensorDataProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.tensor.VariantTensorDataProto(
        typeName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        metadata = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        tensors = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[org.tensorflow.framework.tensor.TensorProto]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TensorProtoCompanion.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TensorProtoCompanion.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = org.tensorflow.framework.tensor.TensorProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.framework.tensor.VariantTensorDataProto(
    typeName = "",
    metadata = _root_.com.google.protobuf.ByteString.EMPTY,
    tensors = _root_.scala.Seq.empty
  )
  implicit class VariantTensorDataProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.tensor.VariantTensorDataProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.tensor.VariantTensorDataProto](_l) {
    def typeName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.typeName)((c_, f_) => c_.copy(typeName = f_))
    def metadata: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.metadata)((c_, f_) => c_.copy(metadata = f_))
    def tensors: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[org.tensorflow.framework.tensor.TensorProto]] = field(_.tensors)((c_, f_) => c_.copy(tensors = f_))
  }
  final val TYPE_NAME_FIELD_NUMBER = 1
  final val METADATA_FIELD_NUMBER = 2
  final val TENSORS_FIELD_NUMBER = 3
  def of(
    typeName: _root_.scala.Predef.String,
    metadata: _root_.com.google.protobuf.ByteString,
    tensors: _root_.scala.Seq[org.tensorflow.framework.tensor.TensorProto]
  ): _root_.org.tensorflow.framework.tensor.VariantTensorDataProto = _root_.org.tensorflow.framework.tensor.VariantTensorDataProto(
    typeName,
    metadata,
    tensors
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[tensorflow.VariantTensorDataProto])
}
