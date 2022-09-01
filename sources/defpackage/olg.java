package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: olg  reason: default package */
/* loaded from: classes2.dex */
public final class olg implements oly, olf {
    private static final Map a;
    private static final HashMap b;
    private static final HashMap c;
    private static final HashMap d;
    private final Class e;

    static {
        int i = 0;
        List y = nxp.y(new Class[]{okf.class, okq.class, oku.class, okv.class, okw.class, okx.class, oky.class, okz.class, ola.class, olb.class, okg.class, okh.class, oki.class, okj.class, okk.class, okl.class, okm.class, okn.class, oko.class, okp.class, okr.class, oks.class, okt.class});
        ArrayList arrayList = new ArrayList(nxp.u(y));
        for (Object obj : y) {
            int i2 = i + 1;
            if (i < 0) {
                nxp.r();
            }
            arrayList.add(oix.b((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = nxp.m(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        c = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        oll.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            oll.d(str, "kotlinName");
            sb.append(ols.n(str));
            sb.append("CompanionObject");
            ojc b2 = oix.b(sb.toString(), String.valueOf(str).concat(".Companion"));
            hashMap3.put(b2.a, b2.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(nxp.k(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), ols.n((String) entry2.getValue()));
        }
    }

    public olg(Class cls) {
        this.e = cls;
    }

    @Override // defpackage.olf
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof olg) && oll.g(oli.b(this), oli.b((oly) obj));
    }

    public final int hashCode() {
        return oli.b(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.e.toString()).concat(" (Kotlin reflection is not available)");
    }
}
