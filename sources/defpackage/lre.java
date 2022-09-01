package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

/* compiled from: PG */
/* renamed from: lre  reason: default package */
/* loaded from: classes.dex */
public final class lre {
    public static volatile boolean a;

    public static ArrayList A() {
        return new ArrayList();
    }

    public static ArrayList B(Iterable iterable) {
        jdg.u(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return C(iterable.iterator());
    }

    public static ArrayList C(Iterator it) {
        ArrayList A = A();
        U(A, it);
        return A;
    }

    @SafeVarargs
    public static ArrayList D(Object... objArr) {
        jdg.u(objArr);
        int length = objArr.length;
        jez.W(length, "arraySize");
        ArrayList arrayList = new ArrayList(mhq.m(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList E(int i) {
        jez.W(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static LinkedList F() {
        return new LinkedList();
    }

    public static List G(List list) {
        if (list instanceof llp) {
            return ((llp) list).a();
        }
        if (list instanceof lor) {
            return ((lor) list).a;
        }
        if (list instanceof RandomAccess) {
            return new lop(list);
        }
        return new lor(list);
    }

    public static List H(List list, leq leqVar) {
        if (list instanceof RandomAccess) {
            return new lot(list, leqVar);
        }
        return new lov(list, leqVar);
    }

    public static boolean I(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!jdg.W(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it2.hasNext()) {
                    if (!jdg.W(it.next(), it2.next())) {
                        break;
                    }
                } else {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static int J(Iterator it, int i) {
        jdg.u(it);
        int i2 = 0;
        jdg.w(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int K(Iterator it, lfe lfeVar) {
        jdg.Q(lfeVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (lfeVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int L(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return mhq.m(j);
    }

    public static lsz M(Iterator it, lfe lfeVar) {
        jdg.u(it);
        jdg.u(lfeVar);
        return new lny(it, lfeVar);
    }

    public static lsz N(Object obj) {
        return new lob(obj);
    }

    public static Object O(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object P(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Iterator Q(Iterator it) {
        return new lod(it);
    }

    public static Iterator R(Iterator it, Iterator it2) {
        return Q(new lnx(new Iterator[]{it, it2}));
    }

    public static Iterator S(Iterator it, leq leqVar) {
        jdg.u(leqVar);
        return new lnz(it, leqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T(Iterator it) {
        jdg.u(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean U(Collection collection, Iterator it) {
        jdg.u(collection);
        jdg.u(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static Object W(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int X(Iterable iterable, lfe lfeVar) {
        return K(iterable.iterator(), lfeVar);
    }

    public static int Y(Iterable iterable) {
        return L(iterable.iterator());
    }

    public static Iterable Z(Iterable iterable, lfe lfeVar) {
        jdg.u(iterable);
        jdg.u(lfeVar);
        return new lnr(iterable, lfeVar);
    }

    public static ArrayDeque a() {
        return new ArrayDeque();
    }

    public static String aA(jie jieVar) {
        return aB(jieVar) ? jieVar.h : jieVar.f;
    }

    public static boolean aB(jie jieVar) {
        if ((jieVar.a & 32) != 0) {
            noi noiVar = jieVar.g;
            if (noiVar == null) {
                noiVar = noi.b;
            }
            for (noh nohVar : noiVar.a) {
                if (nohVar.a == 4) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean aC(long j, jjd jjdVar) {
        return j <= jjdVar.a();
    }

    public static boolean aD(jig jigVar) {
        if (jigVar.l) {
            for (jie jieVar : jigVar.m) {
                int j = ker.j(jieVar.l);
                if (j != 0 && j == 2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean aE(jie jieVar) {
        lmz s = lmz.s("file", "asset");
        if ((jieVar.a & 2) != 0) {
            int indexOf = jieVar.c.indexOf(58);
            jdg.J(indexOf >= 0, "Invalid url: %s", jieVar.c);
            String substring = jieVar.c.substring(0, indexOf);
            lsz it = s.iterator();
            while (it.hasNext()) {
                if (jdg.Z(substring, (String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static int aF() {
        return ((Boolean) gqj.d.c()).booleanValue() ? R.id.key_pos_header_power_key : R.id.key_pos_header_voice;
    }

    public static boolean aG(Context context, EditorInfo editorInfo) {
        if (!ino.L().x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, true) || ham.aq(context, editorInfo) || ham.V(editorInfo)) {
            return true;
        }
        return !irs.d() && !ijw.c(context, "android.permission.RECORD_AUDIO");
    }

    public static boolean aH(Context context, EditorInfo editorInfo, boolean z) {
        if (!aG(context, editorInfo)) {
            return ham.G(editorInfo) || z;
        }
        return false;
    }

    public static boolean aI(Context context, EditorInfo editorInfo) {
        if (!aG(context, editorInfo)) {
            if (a) {
                a = !ijw.c(context, "android.permission.RECORD_AUDIO");
            }
            return a;
        }
        return false;
    }

    public static void aJ(gqe gqeVar) {
        iaj c = ial.c();
        gqeVar.k(-10042, null);
        c.k();
        c.b = iah.LONG_PRESS;
        c.f = true;
        c.n(-10042, null, "talkback_sticky");
        gqeVar.c(c.b());
        c.k();
        c.b = iah.DOUBLE_TAP;
        c.f = true;
        c.n(-10042, null, "sticky");
        gqeVar.c(c.b());
    }

    public static void aK(jbw jbwVar) {
        jbwVar.t();
    }

    public static void aL(jbw jbwVar, bnq bnqVar) {
        jbwVar.v(bnqVar, jbv.a);
    }

    public static /* synthetic */ void aM(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static void aN(Context context, lfb lfbVar, jig jigVar, kcq kcqVar) {
        Uri ay = ay(context, lfbVar, jigVar);
        if (kcqVar.v(ay)) {
            kpp kppVar = new kpp();
            kppVar.a = true;
            Void r0 = (Void) kcqVar.q(ay, kppVar);
        }
    }

    public static kqd aO(Context context, mkr mkrVar, lwm lwmVar, boe boeVar, lfb lfbVar) {
        kqj d = kql.d(context, mkrVar);
        d.c = jez.t("gms_icing_mdd_groups", lfbVar);
        d.b();
        d.d = aT(boeVar);
        d.c(new jmr(0));
        return d.a();
    }

    public static kqd aP(Context context, mkr mkrVar, lwm lwmVar, boe boeVar, lfb lfbVar) {
        kqj d = kql.d(context, mkrVar);
        d.c = jez.t("gms_icing_mdd_shared_files", lfbVar);
        d.b();
        d.d = aT(boeVar);
        d.c(new jmr(1));
        return d.a();
    }

    private static Collection aQ(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C(iterable.iterator());
    }

    private static void aR(List list, lfe lfeVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size > i2) {
                if (lfeVar.a(list.get(size))) {
                    list.remove(size);
                }
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static void aS(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }

    private static lgb aT(boe boeVar) {
        return new ihp(boeVar, 6, null);
    }

    public static Iterable aa(Iterable iterable, int i) {
        jdg.u(iterable);
        jdg.w(i >= 0, "limit is negative");
        return new lnv(iterable, i);
    }

    public static Iterable ab(Iterable iterable, leq leqVar) {
        jdg.u(iterable);
        jdg.u(leqVar);
        return new lns(iterable, leqVar);
    }

    public static Object ac(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        return O(iterable.iterator());
    }

    public static Object ad(Iterable iterable) {
        return P(iterable.iterator());
    }

    public static String ae(Iterable iterable) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(obj);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean af(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        jdg.u(iterable);
        return U(collection, iterable.iterator());
    }

    public static boolean ag(Iterable iterable, lfe lfeVar) {
        jdg.u(lfeVar);
        for (Object obj : iterable) {
            if (!lfeVar.a(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean ah(Iterable iterable, lfe lfeVar) {
        return K(iterable.iterator(), lfeVar) != -1;
    }

    public static boolean ai(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] aj(Iterable iterable) {
        return aQ(iterable).toArray();
    }

    public static Object[] ak(Iterable iterable, Class cls) {
        return al(iterable, f(cls, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] al(Iterable iterable, Object[] objArr) {
        return aQ(iterable).toArray(objArr);
    }

    public static Object am(Iterable iterable, lfe lfeVar) {
        Iterator it = iterable.iterator();
        jdg.u(it);
        jdg.u(lfeVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (lfeVar.a(next)) {
                return next;
            }
        }
        return null;
    }

    public static Object an(Iterable iterable) {
        jdg.u(iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(0);
        }
        Iterator it = iterable.iterator();
        int J = J(it, 0);
        if (!it.hasNext()) {
            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + J + ")");
        }
        return it.next();
    }

    public static Object ao(Iterable iterable) {
        return W(iterable.iterator());
    }

    public static Object ap(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return P(it);
        }
        return null;
    }

    public static void aq(List list, lfe lfeVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!lfeVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        aR(list, lfeVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        aR(list, lfeVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static ByteBuffer ar(Iterable iterable) {
        Iterator it;
        String format;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (iterable.iterator().hasNext()) {
            j += ((ngz) it.next()).s() + 12;
            i2++;
        }
        if (i2 != 0) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ngz ngzVar = (ngz) it2.next();
                    int s = ngzVar.s();
                    try {
                        allocate.putInt(s);
                        int i3 = i + 4;
                        try {
                            ngzVar.ii(Cnew.ak(array, i3, s));
                        } catch (IOException e) {
                            Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                        }
                        try {
                            allocate.put(array, i3, s);
                            int i4 = i3 + s;
                            CRC32 crc32 = new CRC32();
                            crc32.update(array, i4 - s, s);
                            allocate.putLong(crc32.getValue());
                            i = i4 + 8;
                        } catch (BufferOverflowException e2) {
                            aS(e2);
                            return null;
                        }
                    } catch (BufferOverflowException e3) {
                        aS(e3);
                        return null;
                    }
                }
                allocate.rewind();
                return allocate;
            } catch (IllegalArgumentException e4) {
                Object[] objArr = new Object[1];
                if (j > 1073741824) {
                    Locale locale = Locale.US;
                    double d = j;
                    Double.isNaN(d);
                    format = String.format(locale, "%.2fGB", Double.valueOf(d / 1.073741824E9d));
                } else if (j > 1048576) {
                    Locale locale2 = Locale.US;
                    double d2 = j;
                    Double.isNaN(d2);
                    format = String.format(locale2, "%.2fMB", Double.valueOf(d2 / 1048576.0d));
                } else if (j > 1024) {
                    Locale locale3 = Locale.US;
                    double d3 = j;
                    Double.isNaN(d3);
                    format = String.format(locale3, "%.2fKB", Double.valueOf(d3 / 1024.0d));
                } else {
                    format = String.format(Locale.US, "%d Bytes", Long.valueOf(j));
                }
                objArr[0] = format;
                Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", objArr), e4);
                return null;
            }
        }
        return ByteBuffer.allocate(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1 A[LOOP:0: B:2:0x0019->B:20:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List as(java.nio.ByteBuffer r16, java.lang.Class r17, defpackage.nhf r18) {
        /*
            r1 = r16
            java.lang.String r2 = "ProtoLiteUtil"
            java.lang.String r3 = r17.toString()
            int r4 = r16.limit()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r16.limit()
            int r0 = r0 / 1000
            r6 = 1
            int r0 = r0 + r6
            r5.<init>(r0)
        L19:
            int r0 = r16.position()
            if (r0 >= r4) goto Le8
            r7 = 0
            r8 = 0
            int r9 = r16.getInt()     // Catch: java.nio.BufferUnderflowException -> Ld8
            r0 = 2
            if (r9 >= 0) goto L3c
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            r0[r6] = r3
            java.lang.String r1 = "Invalid message size: %d. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r7
        L3c:
            int r10 = r16.position()
            int r10 = r10 + r9
            int r10 = r10 + 8
            if (r4 >= r10) goto L5d
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r6] = r1
            java.lang.String r1 = "Invalid message size: %d (buffer end is %d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r5
        L5d:
            int r10 = r16.position()
            int r10 = r10 + r9
            long r10 = r1.getLong(r10)
            byte[] r12 = r16.array()
            int r13 = r16.arrayOffset()
            int r14 = r16.position()
            java.util.zip.CRC32 r15 = new java.util.zip.CRC32
            r15.<init>()
            int r13 = r13 + r14
            r15.update(r12, r13, r9)
            long r12 = r15.getValue()
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto Lc0
            byte[] r0 = r16.array()
            int r8 = r16.arrayOffset()
            int r10 = r16.position()
            int r8 = r8 + r10
            nfb r10 = defpackage.nfb.a()     // Catch: defpackage.ngd -> L9d
            r14 = r18
            java.lang.Object r0 = r14.i(r0, r8, r9, r10)     // Catch: defpackage.ngd -> L9b
            goto Lae
        L9b:
            r0 = move-exception
            goto La0
        L9d:
            r0 = move-exception
            r14 = r18
        La0:
            java.lang.String r8 = "Cannot deserialize message of type "
            java.lang.String r10 = r17.toString()
            java.lang.String r8 = r8.concat(r10)
            android.util.Log.e(r2, r8, r0)
            r0 = r7
        Lae:
            if (r0 != 0) goto Lb1
            return r7
        Lb1:
            r5.add(r0)
            int r0 = r16.position()
            int r0 = r0 + r9
            int r0 = r0 + 8
            r1.position(r0)
            goto L19
        Lc0:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0[r8] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0[r6] = r1
            java.lang.String r1 = "Corrupt protobuf data, expected CRC: %d computed CRC: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r5
        Ld8:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r3
            java.lang.String r3 = "Buffer underflow. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            android.util.Log.e(r2, r0, r1)
            return r7
        Le8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lre.as(java.nio.ByteBuffer, java.lang.Class, nhf):java.util.List");
    }

    public static jiq at(String str) {
        try {
            return (jiq) jez.r(str, (nhf) jiq.f.N(7));
        } catch (ngd e) {
            throw new jmq("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    public static File au(Context context, lfb lfbVar) {
        String str = "gms_icing_mdd_garbage_file";
        if (lfbVar != null && lfbVar.e()) {
            str = str.concat((String) lfbVar.a());
        }
        return new File(context.getFilesDir(), str);
    }

    public static String av(jiq jiqVar) {
        return Base64.encodeToString(jiqVar.q(), 3);
    }

    public static long aw(jig jigVar) {
        if (jigVar.j == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(jigVar.j);
    }

    public static Uri ax(Context context, lfb lfbVar, jie jieVar, jig jigVar) {
        String[] split;
        Uri.Builder buildUpon = ay(context, lfbVar, jigVar).buildUpon();
        if (!jieVar.o.isEmpty()) {
            for (String str : jieVar.o.split("/", -1)) {
                if (!str.isEmpty()) {
                    buildUpon.appendPath(str);
                }
            }
        } else {
            String str2 = jieVar.c;
            buildUpon.appendPath(str2.substring(str2.lastIndexOf("/") + 1));
        }
        return buildUpon.build();
    }

    public static Uri ay(Context context, lfb lfbVar, jig jigVar) {
        String str = !jigVar.u.isEmpty() ? jigVar.u : jigVar.c;
        int h = ker.h(jigVar.h);
        if (h == 0) {
            h = 1;
        }
        return lxj.u(context, lfbVar).buildUpon().appendPath("links").build().buildUpon().appendPath(lxj.x(h)).build().buildUpon().appendPath(str).build();
    }

    public static jig az(jig jigVar, long j) {
        jif jifVar = jigVar.b;
        if (jifVar == null) {
            jifVar = jif.g;
        }
        nfh nfhVar = (nfh) jifVar.N(5);
        nfhVar.cG(jifVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jif jifVar2 = (jif) nfhVar.b;
        jifVar2.a |= 1;
        jifVar2.b = j;
        jif jifVar3 = (jif) nfhVar.cz();
        nfh nfhVar2 = (nfh) jigVar.N(5);
        nfhVar2.cG(jigVar);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        jig jigVar2 = (jig) nfhVar2.b;
        jifVar3.getClass();
        jigVar2.b = jifVar3;
        jigVar2.a |= 1;
        return (jig) nfhVar2.cz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map c() {
        return new lkc(12);
    }

    public static Object[] d(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static Object[] e(Object[] objArr, Object[] objArr2, Class cls) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] f = f(cls, length + length2);
        System.arraycopy(objArr, 0, f, 0, length);
        System.arraycopy(objArr2, 0, f, length, length2);
        return f;
    }

    public static Object[] f(Class cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, int i) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("at index " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object... objArr) {
        i(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            g(objArr[i2], i2);
        }
    }

    public static void j(Iterable iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(lqx lqxVar, Object obj) {
        if (obj == lqxVar) {
            return true;
        }
        if (obj instanceof lqx) {
            lqx lqxVar2 = (lqx) obj;
            if (lqxVar.size() == lqxVar2.size() && lqxVar.f().size() == lqxVar2.f().size()) {
                for (lqw lqwVar : lqxVar2.f()) {
                    if (lqxVar.a(lqwVar.b()) != lqwVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int l(int i) {
        if (i < 3) {
            jez.W(i, "expectedSize");
            return i + 1;
        } else if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        } else {
            double d = i;
            Double.isNaN(d);
            return (int) Math.ceil(d / 0.75d);
        }
    }

    public static llw m(Map map) {
        if (map instanceof llj) {
            return (llj) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return lrq.b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        jez.U(r1, value);
        EnumMap enumMap = new EnumMap(r1.getDeclaringClass());
        enumMap.put((EnumMap) r1, (Enum) value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            jez.U(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return lrq.b;
        }
        if (size == 1) {
            Map.Entry entry3 = (Map.Entry) ad(enumMap.entrySet());
            return llw.l((Enum) entry3.getKey(), entry3.getValue());
        }
        return new llj(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object n(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object o(Map map, Object obj) {
        jdg.u(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String p(Map map) {
        int size = map.size();
        jez.W(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static HashMap q() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Iterator r(Iterator it) {
        return new lqd(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Iterator s(Iterator it) {
        return new lqe(it);
    }

    public static LinkedHashMap t() {
        return new LinkedHashMap();
    }

    public static Map.Entry u(Object obj, Object obj2) {
        return new llh(obj, obj2);
    }

    public static Map v(Map map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap) map);
        }
        return Collections.unmodifiableMap(map);
    }

    public static TreeMap w() {
        return new TreeMap();
    }

    public static TreeMap x(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static void y(Map map, Map map2, lep lepVar, Map map3, Map map4, Map map5, Map map6) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map2.containsKey(key)) {
                Object remove = map4.remove(key);
                if (!lepVar.d(value, remove)) {
                    map6.put(key, new lqo(value, remove));
                } else {
                    map5.put(key, value);
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    public static boolean z(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    public static boolean V(Iterator it, Object obj) {
        if (obj != null) {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }
}
