
package tests;

@javax.annotation.Generated("gbc")
public class Foo implements com.microsoft.bond.BondSerializable {
    
    private static final class StructBondTypeImpl extends com.microsoft.bond.StructBondType<Foo> {
        
        static final class StructBondTypeBuilderImpl extends com.microsoft.bond.StructBondType.StructBondTypeBuilder<Foo> {
            
            @Override
            public final int getGenericTypeParameterCount() {
                return 0;
            }

            @Override
            protected final com.microsoft.bond.StructBondType<Foo> buildNewInstance(com.microsoft.bond.BondType[] genericTypeArguments) {
                return new StructBondTypeImpl(null);
            }

            static void register() {
                registerStructType(Foo.class, new StructBondTypeBuilderImpl());
            }
        }

        

        private StructBondTypeImpl(com.microsoft.bond.GenericTypeSpecialization genericTypeSpecialization) {
            super(genericTypeSpecialization);
        }
        
        @Override
        protected final void initialize() {
            super.initializeBaseAndFields(null);
        }

        @Override
        public final String getName() {
            return "Foo";
        }

        @Override
        public final String getQualifiedName() {
            return "tests.Foo";
        }

        @Override
        public final java.lang.Class<Foo> getValueClass() {
            return (java.lang.Class<Foo>) (java.lang.Class) Foo.class;
        }

        @Override
        public final Foo newInstance() {
            return new Foo();
        }
        
        @Override
        protected final void serializeStructFields(com.microsoft.bond.BondType.SerializationContext context, Foo value) throws java.io.IOException {
        }
        
        @Override
        protected final void deserializeStructFields(com.microsoft.bond.BondType.TaggedDeserializationContext context, Foo value) throws java.io.IOException {
            while (this.readField(context)) {
                switch (context.readFieldResult.id) {
                    default:
                        context.reader.skip(context.readFieldResult.type);
                        break;
                }
            }
        }
        
        @Override
        protected final void deserializeStructFields(com.microsoft.bond.BondType.UntaggedDeserializationContext context, Foo value) throws java.io.IOException {
        }
        
        @Override
        protected final void initializeStructFields(Foo value) {
        }
        
        @Override
        protected final void cloneStructFields(Foo fromValue, Foo toValue) {
        }
    }

    public static final com.microsoft.bond.StructBondType<Foo> BOND_TYPE = new StructBondTypeImpl.StructBondTypeBuilderImpl().getInitializedFromCache();

    public static void initializeBondType() {
        StructBondTypeImpl.StructBondTypeBuilderImpl.register();
    }

    static {
        initializeBondType();
    }
    

    
    
    public Foo() {
        super();
        ((StructBondTypeImpl)BOND_TYPE).initializeStructFields(this);
    };

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Foo)) return false;
        
        final Foo other = (Foo) o;
        
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        
        return result;
    }

    @Override
    public com.microsoft.bond.StructBondType<? extends Foo> getBondType() {
        return BOND_TYPE;
    }
}

package tests;

@javax.annotation.Generated("gbc")
public class ComplexTypes implements com.microsoft.bond.BondSerializable {
    
    private static final class StructBondTypeImpl extends com.microsoft.bond.StructBondType<ComplexTypes> {
        
        static final class StructBondTypeBuilderImpl extends com.microsoft.bond.StructBondType.StructBondTypeBuilder<ComplexTypes> {
            
            @Override
            public final int getGenericTypeParameterCount() {
                return 0;
            }

            @Override
            protected final com.microsoft.bond.StructBondType<ComplexTypes> buildNewInstance(com.microsoft.bond.BondType[] genericTypeArguments) {
                return new StructBondTypeImpl(null);
            }

            static void register() {
                registerStructType(ComplexTypes.class, new StructBondTypeBuilderImpl());
            }
        }

        private com.microsoft.bond.StructBondType.ObjectStructField<java.util.List<java.lang.Byte>> li8;

        private com.microsoft.bond.StructBondType.ObjectStructField<java.util.Set<java.lang.Boolean>> sb;

        private com.microsoft.bond.StructBondType.ObjectStructField<java.util.List<com.microsoft.bond.Blob>> vb;

        private com.microsoft.bond.StructBondType.ObjectStructField<java.lang.Float> nf;

        private com.microsoft.bond.StructBondType.ObjectStructField<java.util.Map<java.lang.String, java.lang.String>> msws;

        private com.microsoft.bond.StructBondType.ObjectStructField<com.microsoft.bond.Bonded<tests.Foo>> bfoo;

        private com.microsoft.bond.StructBondType.ObjectStructField<java.util.Map<java.lang.Double, java.util.List<java.util.List<com.microsoft.bond.Bonded<tests.Bar>>>>> m;

        private StructBondTypeImpl(com.microsoft.bond.GenericTypeSpecialization genericTypeSpecialization) {
            super(genericTypeSpecialization);
        }
        
        @Override
        protected final void initialize() {
            this.li8 = new com.microsoft.bond.StructBondType.ObjectStructField<java.util.List<java.lang.Byte>>(this, listOf(com.microsoft.bond.BondTypes.INT8), 0, "li8", com.microsoft.bond.Modifier.Optional);
            this.sb = new com.microsoft.bond.StructBondType.ObjectStructField<java.util.Set<java.lang.Boolean>>(this, setOf(com.microsoft.bond.BondTypes.BOOL), 1, "sb", com.microsoft.bond.Modifier.Optional);
            this.vb = new com.microsoft.bond.StructBondType.ObjectStructField<java.util.List<com.microsoft.bond.Blob>>(this, vectorOf(com.microsoft.bond.BondTypes.BLOB), 2, "vb", com.microsoft.bond.Modifier.Optional);
            this.nf = new com.microsoft.bond.StructBondType.ObjectStructField<java.lang.Float>(this, nullableOf(com.microsoft.bond.BondTypes.FLOAT), 3, "nf", com.microsoft.bond.Modifier.Optional);
            this.msws = new com.microsoft.bond.StructBondType.ObjectStructField<java.util.Map<java.lang.String, java.lang.String>>(this, mapOf(com.microsoft.bond.BondTypes.STRING, com.microsoft.bond.BondTypes.WSTRING), 4, "msws", com.microsoft.bond.Modifier.Optional);
            this.bfoo = new com.microsoft.bond.StructBondType.ObjectStructField<com.microsoft.bond.Bonded<tests.Foo>>(this, bondedOf((com.microsoft.bond.StructBondType<tests.Foo>) getStructType(tests.Foo.class)), 5, "bfoo", com.microsoft.bond.Modifier.Optional);
            this.m = new com.microsoft.bond.StructBondType.ObjectStructField<java.util.Map<java.lang.Double, java.util.List<java.util.List<com.microsoft.bond.Bonded<tests.Bar>>>>>(this, mapOf(com.microsoft.bond.BondTypes.DOUBLE, listOf(vectorOf(nullableOf(bondedOf((com.microsoft.bond.StructBondType<tests.Bar>) getStructType(tests.Bar.class)))))), 6, "m", com.microsoft.bond.Modifier.Optional);
            super.initializeBaseAndFields(null, this.li8, this.sb, this.vb, this.nf, this.msws, this.bfoo, this.m);
        }

        @Override
        public final String getName() {
            return "ComplexTypes";
        }

        @Override
        public final String getQualifiedName() {
            return "tests.ComplexTypes";
        }

        @Override
        public final java.lang.Class<ComplexTypes> getValueClass() {
            return (java.lang.Class<ComplexTypes>) (java.lang.Class) ComplexTypes.class;
        }

        @Override
        public final ComplexTypes newInstance() {
            return new ComplexTypes();
        }
        
        @Override
        protected final void serializeStructFields(com.microsoft.bond.BondType.SerializationContext context, ComplexTypes value) throws java.io.IOException {
            this.li8.serialize(context, value.li8);
            this.sb.serialize(context, value.sb);
            this.vb.serialize(context, value.vb);
            this.nf.serialize(context, value.nf);
            this.msws.serialize(context, value.msws);
            this.bfoo.serialize(context, value.bfoo);
            this.m.serialize(context, value.m);
        }
        
        @Override
        protected final void deserializeStructFields(com.microsoft.bond.BondType.TaggedDeserializationContext context, ComplexTypes value) throws java.io.IOException {
            boolean __has_li8 = false;
            boolean __has_sb = false;
            boolean __has_vb = false;
            boolean __has_nf = false;
            boolean __has_msws = false;
            boolean __has_bfoo = false;
            boolean __has_m = false;
            while (this.readField(context)) {
                switch (context.readFieldResult.id) {
                    case 0:
                        value.li8 = this.li8.deserialize(context, __has_li8);
                        __has_li8 = true;
                        break;
                    case 1:
                        value.sb = this.sb.deserialize(context, __has_sb);
                        __has_sb = true;
                        break;
                    case 2:
                        value.vb = this.vb.deserialize(context, __has_vb);
                        __has_vb = true;
                        break;
                    case 3:
                        value.nf = this.nf.deserialize(context, __has_nf);
                        __has_nf = true;
                        break;
                    case 4:
                        value.msws = this.msws.deserialize(context, __has_msws);
                        __has_msws = true;
                        break;
                    case 5:
                        value.bfoo = this.bfoo.deserialize(context, __has_bfoo);
                        __has_bfoo = true;
                        break;
                    case 6:
                        value.m = this.m.deserialize(context, __has_m);
                        __has_m = true;
                        break;
                    default:
                        context.reader.skip(context.readFieldResult.type);
                        break;
                }
            }
            this.li8.verifyDeserialized(__has_li8);
            this.sb.verifyDeserialized(__has_sb);
            this.vb.verifyDeserialized(__has_vb);
            this.nf.verifyDeserialized(__has_nf);
            this.msws.verifyDeserialized(__has_msws);
            this.bfoo.verifyDeserialized(__has_bfoo);
            this.m.verifyDeserialized(__has_m);
        }
        
        @Override
        protected final void deserializeStructFields(com.microsoft.bond.BondType.UntaggedDeserializationContext context, ComplexTypes value) throws java.io.IOException {
            value.li8 = this.li8.deserialize(context);
            value.sb = this.sb.deserialize(context);
            value.vb = this.vb.deserialize(context);
            value.nf = this.nf.deserialize(context);
            value.msws = this.msws.deserialize(context);
            value.bfoo = this.bfoo.deserialize(context);
            value.m = this.m.deserialize(context);
        }
        
        @Override
        protected final void initializeStructFields(ComplexTypes value) {
            value.li8 = this.li8.initialize();
            value.sb = this.sb.initialize();
            value.vb = this.vb.initialize();
            value.nf = this.nf.initialize();
            value.msws = this.msws.initialize();
            value.bfoo = this.bfoo.initialize();
            value.m = this.m.initialize();
        }
        
        @Override
        protected final void cloneStructFields(ComplexTypes fromValue, ComplexTypes toValue) {
            toValue.li8 = this.li8.clone(fromValue.li8);
            toValue.sb = this.sb.clone(fromValue.sb);
            toValue.vb = this.vb.clone(fromValue.vb);
            toValue.nf = this.nf.clone(fromValue.nf);
            toValue.msws = this.msws.clone(fromValue.msws);
            toValue.bfoo = this.bfoo.clone(fromValue.bfoo);
            toValue.m = this.m.clone(fromValue.m);
        }
    }

    public static final com.microsoft.bond.StructBondType<ComplexTypes> BOND_TYPE = new StructBondTypeImpl.StructBondTypeBuilderImpl().getInitializedFromCache();

    public static void initializeBondType() {
        StructBondTypeImpl.StructBondTypeBuilderImpl.register();
    }

    static {
        initializeBondType();
    }
    

    public java.util.List<java.lang.Byte> li8;

    public java.util.Set<java.lang.Boolean> sb;

    public java.util.List<com.microsoft.bond.Blob> vb;

    public java.lang.Float nf;

    public java.util.Map<java.lang.String, java.lang.String> msws;

    public com.microsoft.bond.Bonded<tests.Foo> bfoo;

    public java.util.Map<java.lang.Double, java.util.List<java.util.List<com.microsoft.bond.Bonded<tests.Bar>>>> m;
    
    public ComplexTypes() {
        super();
        ((StructBondTypeImpl)BOND_TYPE).initializeStructFields(this);
    };

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ComplexTypes)) return false;
        
        final ComplexTypes other = (ComplexTypes) o;
        if (!((this.li8 == null && other.li8 == null) || (this.li8 != null && this.li8.equals(other.li8)))) return false;
        if (!((this.sb == null && other.sb == null) || (this.sb != null && this.sb.equals(other.sb)))) return false;
        if (!((this.vb == null && other.vb == null) || (this.vb != null && this.vb.equals(other.vb)))) return false;
        if (!((this.nf == null && other.nf == null) || (this.nf != null && this.nf.equals(other.nf)))) return false;
        if (!((this.msws == null && other.msws == null) || (this.msws != null && this.msws.equals(other.msws)))) return false;
        if (!((this.bfoo == null && other.bfoo == null) || (this.bfoo != null && this.bfoo.equals(other.bfoo)))) return false;
        if (!((this.m == null && other.m == null) || (this.m != null && this.m.equals(other.m)))) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += li8 == null ? 0 : li8.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        result += sb == null ? 0 : sb.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        result += vb == null ? 0 : vb.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        result += nf == null ? 0 : nf.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        result += msws == null ? 0 : msws.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        result += bfoo == null ? 0 : bfoo.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        result += m == null ? 0 : m.hashCode();
        result *= 0xeadbeef;
        result ^= result >> 16;
        return result;
    }

    @Override
    public com.microsoft.bond.StructBondType<? extends ComplexTypes> getBondType() {
        return BOND_TYPE;
    }
}
