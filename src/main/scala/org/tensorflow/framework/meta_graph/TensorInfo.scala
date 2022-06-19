// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.meta_graph

/** Information about a Tensor necessary for feeding or retrieval.
  *
  * @param tensorShape
  *   The static shape should be recorded here, to the extent that it can
  *   be known in advance.  In the case of a SparseTensor, this field describes
  *   the logical shape of the represented tensor (aka dense_shape).
  */
@SerialVersionUID(0L)
final case class TensorInfo(
    encoding: org.tensorflow.framework.meta_graph.TensorInfo.Encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Empty,
    dtype: org.tensorflow.framework.types.DataType = org.tensorflow.framework.types.DataType.DT_INVALID,
    tensorShape: _root_.scala.Option[org.tensorflow.framework.tensor_shape.TensorShapeProto] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[TensorInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (encoding.name.isDefined) {
        val __value = encoding.name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (encoding.cooSparse.isDefined) {
        val __value = encoding.cooSparse.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = dtype.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value)
        }
      };
      if (tensorShape.isDefined) {
        val __value = tensorShape.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      encoding.name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      {
        val __v = dtype.value
        if (__v != 0) {
          _output__.writeEnum(2, __v)
        }
      };
      tensorShape.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      encoding.cooSparse.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getName: _root_.scala.Predef.String = encoding.name.getOrElse("")
    def withName(__v: _root_.scala.Predef.String): TensorInfo = copy(encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Name(__v))
    def getCooSparse: org.tensorflow.framework.meta_graph.TensorInfo.CooSparse = encoding.cooSparse.getOrElse(org.tensorflow.framework.meta_graph.TensorInfo.CooSparse.defaultInstance)
    def withCooSparse(__v: org.tensorflow.framework.meta_graph.TensorInfo.CooSparse): TensorInfo = copy(encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.CooSparse(__v))
    def withDtype(__v: org.tensorflow.framework.types.DataType): TensorInfo = copy(dtype = __v)
    def getTensorShape: org.tensorflow.framework.tensor_shape.TensorShapeProto = tensorShape.getOrElse(org.tensorflow.framework.tensor_shape.TensorShapeProto.defaultInstance)
    def clearTensorShape: TensorInfo = copy(tensorShape = _root_.scala.None)
    def withTensorShape(__v: org.tensorflow.framework.tensor_shape.TensorShapeProto): TensorInfo = copy(tensorShape = Option(__v))
    def clearEncoding: TensorInfo = copy(encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Empty)
    def withEncoding(__v: org.tensorflow.framework.meta_graph.TensorInfo.Encoding): TensorInfo = copy(encoding = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => encoding.name.orNull
        case 4 => encoding.cooSparse.orNull
        case 2 => {
          val __t = dtype.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 3 => tensorShape.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => encoding.name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => encoding.cooSparse.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PEnum(dtype.scalaValueDescriptor)
        case 3 => tensorShape.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.meta_graph.TensorInfo
    // @@protoc_insertion_point(GeneratedMessage[tensorflow.TensorInfo])
}

object TensorInfo extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.meta_graph.TensorInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.meta_graph.TensorInfo] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.meta_graph.TensorInfo = {
    var __dtype: org.tensorflow.framework.types.DataType = org.tensorflow.framework.types.DataType.DT_INVALID
    var __tensorShape: _root_.scala.Option[org.tensorflow.framework.tensor_shape.TensorShapeProto] = _root_.scala.None
    var __encoding: org.tensorflow.framework.meta_graph.TensorInfo.Encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Empty
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Name(_input__.readStringRequireUtf8())
        case 34 =>
          __encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.CooSparse(__encoding.cooSparse.fold(_root_.scalapb.LiteParser.readMessage[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 16 =>
          __dtype = org.tensorflow.framework.types.DataType.fromValue(_input__.readEnum())
        case 26 =>
          __tensorShape = Option(__tensorShape.fold(_root_.scalapb.LiteParser.readMessage[org.tensorflow.framework.tensor_shape.TensorShapeProto](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    org.tensorflow.framework.meta_graph.TensorInfo(
        dtype = __dtype,
        tensorShape = __tensorShape,
        encoding = __encoding,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.meta_graph.TensorInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.meta_graph.TensorInfo(
        dtype = org.tensorflow.framework.types.DataType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(org.tensorflow.framework.types.DataType.DT_INVALID.scalaValueDescriptor).number),
        tensorShape = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[org.tensorflow.framework.tensor_shape.TensorShapeProto]]),
        encoding = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]).map(org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Name(_))
            .orElse[org.tensorflow.framework.meta_graph.TensorInfo.Encoding](__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse]]).map(org.tensorflow.framework.meta_graph.TensorInfo.Encoding.CooSparse(_)))
            .getOrElse(org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MetaGraphProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MetaGraphProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = org.tensorflow.framework.meta_graph.TensorInfo.CooSparse
      case 3 => __out = org.tensorflow.framework.tensor_shape.TensorShapeProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.org.tensorflow.framework.meta_graph.TensorInfo.CooSparse
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => org.tensorflow.framework.types.DataType
    }
  }
  lazy val defaultInstance = org.tensorflow.framework.meta_graph.TensorInfo(
    dtype = org.tensorflow.framework.types.DataType.DT_INVALID,
    tensorShape = _root_.scala.None,
    encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Empty
  )
  sealed trait Encoding extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isName: _root_.scala.Boolean = false
    def isCooSparse: _root_.scala.Boolean = false
    def name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    def cooSparse: _root_.scala.Option[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse] = _root_.scala.None
  }
  object Encoding {
    @SerialVersionUID(0L)
    case object Empty extends org.tensorflow.framework.meta_graph.TensorInfo.Encoding {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class Name(value: _root_.scala.Predef.String) extends org.tensorflow.framework.meta_graph.TensorInfo.Encoding {
      type ValueType = _root_.scala.Predef.String
      override def isName: _root_.scala.Boolean = true
      override def name: _root_.scala.Option[_root_.scala.Predef.String] = Some(value)
      override def number: _root_.scala.Int = 1
    }
    @SerialVersionUID(0L)
    final case class CooSparse(value: org.tensorflow.framework.meta_graph.TensorInfo.CooSparse) extends org.tensorflow.framework.meta_graph.TensorInfo.Encoding {
      type ValueType = org.tensorflow.framework.meta_graph.TensorInfo.CooSparse
      override def isCooSparse: _root_.scala.Boolean = true
      override def cooSparse: _root_.scala.Option[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse] = Some(value)
      override def number: _root_.scala.Int = 4
    }
  }
  /** For sparse tensors, The COO encoding stores a triple of values, indices,
    * and shape.
    *
    * @param valuesTensorName
    *   The shape of the values Tensor is [?].  Its dtype must be the dtype of
    *   the SparseTensor as a whole, given in the enclosing TensorInfo.
    * @param indicesTensorName
    *   The indices Tensor must have dtype int64 and shape [?, ?].
    * @param denseShapeTensorName
    *   The dynamic logical shape represented by the SparseTensor is recorded in
    *   the Tensor referenced here.  It must have dtype int64 and shape [?].
    */
  @SerialVersionUID(0L)
  final case class CooSparse(
      valuesTensorName: _root_.scala.Predef.String = "",
      indicesTensorName: _root_.scala.Predef.String = "",
      denseShapeTensorName: _root_.scala.Predef.String = "",
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[CooSparse] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = valuesTensorName
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = indicesTensorName
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        
        {
          val __value = denseShapeTensorName
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
          val __v = valuesTensorName
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = indicesTensorName
          if (!__v.isEmpty) {
            _output__.writeString(2, __v)
          }
        };
        {
          val __v = denseShapeTensorName
          if (!__v.isEmpty) {
            _output__.writeString(3, __v)
          }
        };
        unknownFields.writeTo(_output__)
      }
      def withValuesTensorName(__v: _root_.scala.Predef.String): CooSparse = copy(valuesTensorName = __v)
      def withIndicesTensorName(__v: _root_.scala.Predef.String): CooSparse = copy(indicesTensorName = __v)
      def withDenseShapeTensorName(__v: _root_.scala.Predef.String): CooSparse = copy(denseShapeTensorName = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = valuesTensorName
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = indicesTensorName
            if (__t != "") __t else null
          }
          case 3 => {
            val __t = denseShapeTensorName
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(valuesTensorName)
          case 2 => _root_.scalapb.descriptors.PString(indicesTensorName)
          case 3 => _root_.scalapb.descriptors.PString(denseShapeTensorName)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = org.tensorflow.framework.meta_graph.TensorInfo.CooSparse
      // @@protoc_insertion_point(GeneratedMessage[tensorflow.TensorInfo.CooSparse])
  }
  
  object CooSparse extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.meta_graph.TensorInfo.CooSparse = {
      var __valuesTensorName: _root_.scala.Predef.String = ""
      var __indicesTensorName: _root_.scala.Predef.String = ""
      var __denseShapeTensorName: _root_.scala.Predef.String = ""
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __valuesTensorName = _input__.readStringRequireUtf8()
          case 18 =>
            __indicesTensorName = _input__.readStringRequireUtf8()
          case 26 =>
            __denseShapeTensorName = _input__.readStringRequireUtf8()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      org.tensorflow.framework.meta_graph.TensorInfo.CooSparse(
          valuesTensorName = __valuesTensorName,
          indicesTensorName = __indicesTensorName,
          denseShapeTensorName = __denseShapeTensorName,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.meta_graph.TensorInfo.CooSparse] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        org.tensorflow.framework.meta_graph.TensorInfo.CooSparse(
          valuesTensorName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          indicesTensorName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          denseShapeTensorName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = org.tensorflow.framework.meta_graph.TensorInfo.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = org.tensorflow.framework.meta_graph.TensorInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = org.tensorflow.framework.meta_graph.TensorInfo.CooSparse(
      valuesTensorName = "",
      indicesTensorName = "",
      denseShapeTensorName = ""
    )
    implicit class CooSparseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.meta_graph.TensorInfo.CooSparse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.meta_graph.TensorInfo.CooSparse](_l) {
      def valuesTensorName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.valuesTensorName)((c_, f_) => c_.copy(valuesTensorName = f_))
      def indicesTensorName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.indicesTensorName)((c_, f_) => c_.copy(indicesTensorName = f_))
      def denseShapeTensorName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.denseShapeTensorName)((c_, f_) => c_.copy(denseShapeTensorName = f_))
    }
    final val VALUES_TENSOR_NAME_FIELD_NUMBER = 1
    final val INDICES_TENSOR_NAME_FIELD_NUMBER = 2
    final val DENSE_SHAPE_TENSOR_NAME_FIELD_NUMBER = 3
    def of(
      valuesTensorName: _root_.scala.Predef.String,
      indicesTensorName: _root_.scala.Predef.String,
      denseShapeTensorName: _root_.scala.Predef.String
    ): _root_.org.tensorflow.framework.meta_graph.TensorInfo.CooSparse = _root_.org.tensorflow.framework.meta_graph.TensorInfo.CooSparse(
      valuesTensorName,
      indicesTensorName,
      denseShapeTensorName
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[tensorflow.TensorInfo.CooSparse])
  }
  
  implicit class TensorInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.meta_graph.TensorInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.meta_graph.TensorInfo](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.Name(f_)))
    def cooSparse: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.meta_graph.TensorInfo.CooSparse] = field(_.getCooSparse)((c_, f_) => c_.copy(encoding = org.tensorflow.framework.meta_graph.TensorInfo.Encoding.CooSparse(f_)))
    def dtype: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.types.DataType] = field(_.dtype)((c_, f_) => c_.copy(dtype = f_))
    def tensorShape: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.tensor_shape.TensorShapeProto] = field(_.getTensorShape)((c_, f_) => c_.copy(tensorShape = Option(f_)))
    def optionalTensorShape: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[org.tensorflow.framework.tensor_shape.TensorShapeProto]] = field(_.tensorShape)((c_, f_) => c_.copy(tensorShape = f_))
    def encoding: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.meta_graph.TensorInfo.Encoding] = field(_.encoding)((c_, f_) => c_.copy(encoding = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val COO_SPARSE_FIELD_NUMBER = 4
  final val DTYPE_FIELD_NUMBER = 2
  final val TENSOR_SHAPE_FIELD_NUMBER = 3
  def of(
    encoding: org.tensorflow.framework.meta_graph.TensorInfo.Encoding,
    dtype: org.tensorflow.framework.types.DataType,
    tensorShape: _root_.scala.Option[org.tensorflow.framework.tensor_shape.TensorShapeProto]
  ): _root_.org.tensorflow.framework.meta_graph.TensorInfo = _root_.org.tensorflow.framework.meta_graph.TensorInfo(
    encoding,
    dtype,
    tensorShape
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[tensorflow.TensorInfo])
}