package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: nxp */
/* loaded from: classes2.dex */
public class nxp {
    public static void A(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        oll.e(bArr, "<this>");
        oll.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void B(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        oll.e(iArr, "<this>");
        oll.e(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void C(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        oll.e(objArr, "<this>");
        oll.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ String E(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, okq okqVar, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        char c = 0;
        char c2 = (i & 8) != 0 ? (char) 65535 : (char) 0;
        String str = (i & 16) != 0 ? "..." : null;
        if ((i & 32) != 0) {
            okqVar = null;
        }
        oll.e(objArr, "<this>");
        oll.e(charSequence, "separator");
        oll.e(charSequence2, "prefix");
        oll.e(charSequence3, "postfix");
        oll.e(str, "truncated");
        StringBuilder sb = new StringBuilder();
        oll.e(objArr, "<this>");
        oll.e(charSequence, "separator");
        oll.e(charSequence2, "prefix");
        oll.e(charSequence3, "postfix");
        oll.e(str, "truncated");
        sb.append(charSequence2);
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                c = c2;
                break;
            }
            Object obj = objArr[i2];
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (c2 >= 0 && i3 > 0) {
                break;
            }
            ols.e(sb, obj, okqVar);
            i2++;
        }
        if (c >= 0 && i3 > 0) {
            sb.append((CharSequence) str);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static int F(Parcel parcel, nvu nvuVar) {
        int i = nvuVar.o.r << 16;
        String str = nvuVar.p;
        if (str != null && str.length() > 1000) {
            str = str.substring(0, 1000);
        }
        if (str != null) {
            parcel.writeString(str);
            return i | 32;
        }
        return i;
    }

    public static nvu G(int i, Parcel parcel) {
        nvu c = nvu.c((i >> 16) & 255);
        return (i & 32) != 0 ? c.f(parcel.readString()) : c;
    }

    public static void H(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean I(int i, int i2) {
        return (i & i2) != 0;
    }

    public static num K(Parcel parcel, nry nryVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new num();
        }
        Object[] objArr = new Object[readInt + readInt];
        int i = 0;
        int i2 = 0;
        while (i < readInt) {
            int readInt2 = parcel.readInt();
            int i3 = i2 + 4;
            int i4 = i + i;
            objArr[i4] = Y(parcel, readInt2, i3);
            int readInt3 = parcel.readInt();
            int i5 = i3 + readInt2 + 4;
            if (readInt3 == -1) {
                nwe nweVar = (nwe) nryVar.c(nwn.h);
                throw nvu.g.f("Parcelable metadata values not allowed").g();
            } else if (readInt3 >= 0) {
                objArr[i4 + 1] = Y(parcel, readInt3, i5);
                i++;
                i2 = i5 + readInt3;
            } else {
                throw nvu.k.f("Unrecognized metadata sentinel").g();
            }
        }
        return nto.d(readInt, objArr);
    }

    public static void L(Parcel parcel, num numVar) {
        int length;
        int read;
        int a = numVar != null ? nto.a(numVar) : 0;
        if (a == 0) {
            parcel.writeInt(0);
            return;
        }
        Object[] e = nto.e(numVar);
        parcel.writeInt(a);
        for (int i = 0; i < a; i++) {
            int i2 = i + i;
            byte[] bArr = (byte[]) e[i2];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = e[i2 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (!(obj instanceof nxk)) {
                byte[] b = nwr.b();
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i3 = 0;
                    while (true) {
                        length = b.length;
                        if (i3 >= length || (read = inputStream.read(b, i3, length - i3)) == -1) {
                            break;
                        }
                        i3 += read;
                    }
                    if (i3 != length) {
                        parcel.writeInt(i3);
                        if (i3 > 0) {
                            parcel.writeByteArray(b, 0, i3);
                        }
                    } else {
                        throw nvu.i.f("Metadata value too large").g();
                    }
                } finally {
                    nwr.a(b);
                }
            } else {
                parcel.writeInt(-1);
                nxk nxkVar = (nxk) obj;
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ServiceLoader, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.util.ArrayList] */
    public static List N(Class cls, Iterable iterable, ClassLoader classLoader, nvq nvqVar) {
        ?? load;
        Object obj;
        if (!O(classLoader)) {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        } else {
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    obj = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused) {
                    obj = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            nvqVar.b(obj2);
            arrayList.add(obj2);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new nvp(nvqVar, 0)));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean O(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static nvu P(nsu nsuVar) {
        jdg.Q(nsuVar, "context must not be null");
        if (!nsuVar.i()) {
            return null;
        }
        Throwable c = nsuVar.c();
        if (c == null) {
            return nvu.c.f("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return nvu.e.f(c.getMessage()).e(c);
        }
        nvu d = nvu.d(c);
        if (!nvr.UNKNOWN.equals(d.o) || d.q != c) {
            return d.e(c);
        }
        return nvu.c.f("Context cancelled").e(c);
    }

    public static nsb Q(nsb nsbVar, List list) {
        jdg.Q(nsbVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nsbVar = new nsf(nsbVar, (nse) it.next());
        }
        return nsbVar;
    }

    public static npg R(List list, List list2) {
        return new npg(list, list2);
    }

    public static void S(oiy oiyVar, List list) {
        list.add(oiyVar);
    }

    public static void T(oiy oiyVar, List list) {
        list.add(oiyVar);
    }

    public static void U(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public static void V(Object obj) {
        obj.getClass();
    }

    public static void W(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static void X(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static oac i() {
        return new oac();
    }

    public static Set j(Object obj) {
        Set singleton = Collections.singleton(obj);
        oll.d(singleton, "singleton(element)");
        return singleton;
    }

    public static int k(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map l(ojc... ojcVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(k(ojcVarArr.length));
        for (ojc ojcVar : ojcVarArr) {
            linkedHashMap.put(ojcVar.a, ojcVar.b);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map m(Iterable iterable) {
        int size = iterable.size();
        if (size != 0) {
            if (size == 1) {
                ojc ojcVar = (ojc) iterable.get(0);
                oll.e(ojcVar, "pair");
                Map singletonMap = Collections.singletonMap(ojcVar.a, ojcVar.b);
                oll.d(singletonMap, "singletonMap(pair.first, pair.second)");
                return singletonMap;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k(iterable.size()));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ojc ojcVar2 = (ojc) it.next();
                linkedHashMap.put(ojcVar2.a, ojcVar2.b);
            }
            return linkedHashMap;
        }
        return ojs.a;
    }

    public static List n(Object obj) {
        List singletonList = Collections.singletonList(obj);
        oll.d(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static int o(List list) {
        oll.e(list, "<this>");
        return list.size() - 1;
    }

    public static List p(Object... objArr) {
        oll.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ojo(objArr, true));
    }

    public static List q(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : n(list.get(0));
        }
        return ojr.a;
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List s(Collection collection, Iterable iterable) {
        oll.e(collection, "<this>");
        oll.e(iterable, "elements");
        if (iterable instanceof Collection) {
            ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
            arrayList.addAll(collection);
            arrayList.addAll(iterable);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        t(arrayList2, iterable);
        return arrayList2;
    }

    public static void t(Collection collection, Iterable iterable) {
        oll.e(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll(iterable);
            return;
        }
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int u(Iterable iterable) {
        oll.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return iterable.size();
        }
        return 10;
    }

    public static void v(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, okq okqVar) {
        oll.e(iterable, "<this>");
        oll.e(charSequence, "separator");
        oll.e(charSequence2, "prefix");
        oll.e(charSequence3, "postfix");
        oll.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            ols.e(appendable, next, okqVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String w(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, okq okqVar, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        String str = (i & 2) != 0 ? "" : charSequence2;
        String str2 = (i & 4) != 0 ? "" : charSequence3;
        int i2 = (i & 8) != 0 ? -1 : 0;
        String str3 = (i & 16) != 0 ? "..." : null;
        okq okqVar2 = (i & 32) != 0 ? null : okqVar;
        oll.e(iterable, "<this>");
        oll.e(charSequence4, "separator");
        oll.e(str, "prefix");
        oll.e(str2, "postfix");
        oll.e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        v(iterable, sb, charSequence4, str, str2, i2, str3, okqVar2);
        return sb.toString();
    }

    public static void x(Iterable iterable, Collection collection) {
        oll.e(iterable, "<this>");
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }

    public static List y(Object[] objArr) {
        oll.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        oll.d(asList, "asList(this)");
        return asList;
    }

    public static List z(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void J() {
    }

    public void a(long j) {
    }

    public void b(long j) {
    }

    public void c(nvu nvuVar) {
    }

    public nxp d(nsg nsgVar) {
        throw null;
    }

    public void e(num numVar) {
        throw null;
    }

    public void f() {
    }

    public void g(Object obj) {
        throw null;
    }

    public void h(nvu nvuVar, num numVar) {
        throw null;
    }

    private static byte[] Y(Parcel parcel, int i, int i2) {
        if (i2 + i > 8192) {
            throw nvu.i.f("Metadata too large").g();
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
