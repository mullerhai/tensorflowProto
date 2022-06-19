// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.versions

/** Version information for a piece of serialized data
  *
  * There are different types of versions for each type of data
  * (GraphDef, etc.), but they all have the same common shape
  * described here.
  *
  * Each consumer has "consumer" and "min_producer" versions (specified
  * elsewhere).  A consumer is allowed to consume this data if
  *
  *   producer &gt;= min_producer
  *   consumer &gt;= min_consumer
  *   consumer not in bad_consumers
  *
  * @param producer
  *   The version of the code that produced this data.
  * @param minConsumer
  *   Any consumer below this version is not allowed to consume this data.
  * @param badConsumers
  *   Specific consumer versions which are disallowed (e.g. due to bugs).
  */
@SerialVersionUID(0L)
final case class VersionDef(
    producer: _root_.scala.Int = 0,
    minConsumer: _root_.scala.Int = 0,
    badConsumers: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[VersionDef] {
    private[this] def badConsumersSerializedSize = {
      if (__badConsumersSerializedSizeField == 0) __badConsumersSerializedSizeField = {
        var __s: _root_.scala.Int = 0
        badConsumers.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
        __s
      }
      __badConsumersSerializedSizeField
    }
    @transient private[this] var __badConsumersSerializedSizeField: _root_.scala.Int = 0
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = producer
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = minConsumer
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      if (badConsumers.nonEmpty) {
        val __localsize = badConsumersSerializedSize
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
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
        val __v = producer
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = minConsumer
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      if (badConsumers.nonEmpty) {
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(badConsumersSerializedSize)
        badConsumers.foreach(_output__.writeInt32NoTag)
      };
      unknownFields.writeTo(_output__)
    }
    def withProducer(__v: _root_.scala.Int): VersionDef = copy(producer = __v)
    def withMinConsumer(__v: _root_.scala.Int): VersionDef = copy(minConsumer = __v)
    def clearBadConsumers = copy(badConsumers = _root_.scala.Seq.empty)
    def addBadConsumers(__vs: _root_.scala.Int*): VersionDef = addAllBadConsumers(__vs)
    def addAllBadConsumers(__vs: Iterable[_root_.scala.Int]): VersionDef = copy(badConsumers = badConsumers ++ __vs)
    def withBadConsumers(__v: _root_.scala.Seq[_root_.scala.Int]): VersionDef = copy(badConsumers = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = producer
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = minConsumer
          if (__t != 0) __t else null
        }
        case 3 => badConsumers
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(producer)
        case 2 => _root_.scalapb.descriptors.PInt(minConsumer)
        case 3 => _root_.scalapb.descriptors.PRepeated(badConsumers.iterator.map(_root_.scalapb.descriptors.PInt(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.versions.VersionDef
    // @@protoc_insertion_point(GeneratedMessage[tensorflow.VersionDef])
}

object VersionDef extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.versions.VersionDef] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.versions.VersionDef] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.versions.VersionDef = {
    var __producer: _root_.scala.Int = 0
    var __minConsumer: _root_.scala.Int = 0
    val __badConsumers: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __producer = _input__.readInt32()
        case 16 =>
          __minConsumer = _input__.readInt32()
        case 24 =>
          __badConsumers += _input__.readInt32()
        case 26 => {
          val length = _input__.readRawVarint32()
          val oldLimit = _input__.pushLimit(length)
          while (_input__.getBytesUntilLimit > 0) {
            __badConsumers += _input__.readInt32()
          }
          _input__.popLimit(oldLimit)
        }
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    org.tensorflow.framework.versions.VersionDef(
        producer = __producer,
        minConsumer = __minConsumer,
        badConsumers = __badConsumers.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.versions.VersionDef] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.versions.VersionDef(
        producer = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        minConsumer = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        badConsumers = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = VersionsProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = VersionsProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.framework.versions.VersionDef(
    producer = 0,
    minConsumer = 0,
    badConsumers = _root_.scala.Seq.empty
  )
  implicit class VersionDefLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.versions.VersionDef]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.versions.VersionDef](_l) {
    def producer: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.producer)((c_, f_) => c_.copy(producer = f_))
    def minConsumer: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.minConsumer)((c_, f_) => c_.copy(minConsumer = f_))
    def badConsumers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.badConsumers)((c_, f_) => c_.copy(badConsumers = f_))
  }
  final val PRODUCER_FIELD_NUMBER = 1
  final val MIN_CONSUMER_FIELD_NUMBER = 2
  final val BAD_CONSUMERS_FIELD_NUMBER = 3
  def of(
    producer: _root_.scala.Int,
    minConsumer: _root_.scala.Int,
    badConsumers: _root_.scala.Seq[_root_.scala.Int]
  ): _root_.org.tensorflow.framework.versions.VersionDef = _root_.org.tensorflow.framework.versions.VersionDef(
    producer,
    minConsumer,
    badConsumers
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[tensorflow.VersionDef])
}
