package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: dsl  reason: default package */
/* loaded from: classes.dex */
public final class dsl {
    public final Object a;
    public final Object b;
    public final Object c;

    public dsl(Context context) {
        lgb n = jdg.n(new boh(context, 9));
        hdq b = hdq.b();
        Random random = new Random();
        this.b = n;
        this.c = b;
        this.a = random;
    }

    public dsl(hhu hhuVar, SharedPreferences sharedPreferences, hie hieVar) {
        this.c = hhuVar;
        this.b = sharedPreferences;
        this.a = hieVar;
    }

    public dsl(iay iayVar, dsj dsjVar, Handler handler) {
        this.a = iayVar;
        this.b = dsjVar;
        this.c = handler;
    }

    public dsl(Class cls, Class cls2, avc avcVar) {
        this.b = cls;
        this.a = cls2;
        this.c = avcVar;
    }

    public dsl(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public dsl(Method method, Method method2, Method method3) {
        this.a = method;
        this.b = method2;
        this.c = method3;
    }

    public dsl(mko mkoVar, blw blwVar, glz glzVar) {
        this.b = mkoVar;
        this.a = blwVar;
        this.c = glzVar;
    }

    public static final void a() {
        hsx.c().e(ice.HEADER, R.id.f130700_resource_name_obfuscated_res_0x7f0b2201, true, true);
    }

    public static boolean h(String str) {
        return str.isEmpty() || !Character.isWhitespace(str.charAt(0));
    }

    public static boolean i(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.codePointAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static hnd o(CharSequence charSequence) {
        return hnd.a(charSequence, charSequence.length(), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hls] */
    private final hnd p(BreakIterator breakIterator, hne hneVar) {
        CharSequence j = this.b.j(1000);
        if (j == null) {
            j = "";
        }
        breakIterator.setText(j.toString());
        int last = breakIterator.last();
        int previous = breakIterator.previous();
        while (previous != -1) {
            CharSequence subSequence = j.subSequence(previous, last);
            String subSequence2 = previous > 0 ? j.subSequence(previous - 1, previous) : "";
            if (previous <= 0 || !hneVar.a(subSequence2.toString(), subSequence.toString())) {
                previous = breakIterator.previous();
            } else {
                return o(subSequence);
            }
        }
        return o(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (1 != (r4.getModifiers() & 1)) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.reflect.Method q(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b
            java.lang.Object r1 = r3.c
            r2 = 0
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L18
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L16
            r1 = 1
            r0 = r0 & r1
            if (r1 == r0) goto L1a
            goto L19
        L16:
            goto L1a
        L18:
        L19:
            r4 = r2
        L1a:
            if (r4 == 0) goto L2d
            java.lang.Object r0 = r3.a
            if (r0 == 0) goto L2d
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L2d
            return r2
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsl.q(java.lang.Class):java.lang.reflect.Method");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [lgb, java.lang.Object] */
    public final cmi b(cme cmeVar) {
        nfh t = cmi.d.t();
        String str = cmeVar.a;
        int i = 0;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        cmi cmiVar = (cmi) t.b;
        str.getClass();
        cmiVar.a |= 1;
        cmiVar.c = str;
        int intValue = ((Long) cmo.q.c()).intValue();
        if (intValue <= 0) {
            return (cmi) t.cz();
        }
        if (((Boolean) cmo.r.c()).booleanValue()) {
            intValue = ((Random) this.a).nextInt(intValue) + 1;
        }
        String str2 = cmeVar.a;
        StringBuilder sb = new StringBuilder();
        for (cmk cmkVar : cmeVar.b) {
            if (((hdq) this.c).a().contains(cmkVar.a)) {
                cmj cmjVar = cmkVar.b;
                if (cmjVar == null) {
                    cmjVar = cmj.c;
                }
                int i2 = cmjVar.a;
                if (i >= str2.length() || i > i2 || i2 > str2.length()) {
                    break;
                }
                sb.append((CharSequence) str2, i, i2);
                cmj cmjVar2 = cmkVar.b;
                if (cmjVar2 == null) {
                    cmjVar2 = cmj.c;
                }
                i = cmjVar2.b;
            }
        }
        if (i < str2.length()) {
            sb.append((CharSequence) str2, i, str2.length());
        }
        llp D = ((kcq) this.b.a()).D(cnx.g(sb.toString()), intValue);
        final int length = cmeVar.a.length();
        t.cJ((Iterable) Collection$EL.stream(D).map(new Function() { // from class: cmw
            @Override // j$.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo40andThen(Function function) {
                return Objects.requireNonNull(function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                int i3 = length;
                String str3 = (String) obj;
                nfh t2 = cmh.d.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                cmh cmhVar = (cmh) t2.b;
                str3.getClass();
                cmhVar.a = str3;
                cmhVar.b = i3;
                ((cmh) t2.b).c = ffb.g(4);
                return (cmh) t2.cz();
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Objects.requireNonNull(function);
            }
        }).collect(Collectors.toCollection(cag.d)));
        return (cmi) t.cz();
    }

    public final boolean c(Class cls, Class cls2) {
        return ((Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hls] */
    public final hnd d() {
        hqk hT = this.b.hT(1000, 1000, 0);
        CharSequence charSequence = hT.b;
        if (hT.e > 0 || hT.d().length() >= 1000 || hT.c().length() >= 1000) {
            charSequence = null;
        }
        return hnd.a(charSequence, 536870911, 536870911);
    }

    public final hnd e() {
        return p((BreakIterator) this.c, hnc.a);
    }

    public final hnd f() {
        return p((BreakIterator) this.a, hnc.c);
    }

    public final hnd g() {
        return p((BreakIterator) this.a, hnc.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void j(lmx lmxVar, lmx lmxVar2) {
        for (Map.Entry<String, ?> entry : this.b.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                if (value instanceof String) {
                    if (key.startsWith("__bytes__")) {
                        try {
                            String substring = key.substring(9);
                            byte[] j = lyk.d.j((String) value);
                            ((hhu) this.c).d((hie) this.a, substring, j, lmxVar, lmxVar2);
                        } catch (IllegalArgumentException e) {
                            ((ltd) ((ltd) ((ltd) hhu.a.c()).i(e)).k("com/google/android/libraries/inputmethod/flag/FlagManager$FlagPreferenceReader", "readFromSharedPreferencesInternal", 1330, "FlagManager.java")).w("Failed to base64-decode preference %s", key);
                        }
                    } else {
                        Object obj = this.c;
                        hhu hhuVar = (hhu) obj;
                        hhuVar.g((hie) this.a, key, (String) value, lmxVar, lmxVar2);
                    }
                } else if (value instanceof Boolean) {
                    Object obj2 = this.c;
                    hie hieVar = (hie) this.a;
                    ((hhu) obj2).c(hieVar, key, ((Boolean) value).booleanValue(), lmxVar, lmxVar2);
                } else if (value instanceof Long) {
                    Object obj3 = this.c;
                    hie hieVar2 = (hie) this.a;
                    ((hhu) obj3).f(hieVar2, key, ((Long) value).longValue(), lmxVar, lmxVar2);
                } else if (value instanceof Integer) {
                    Object obj4 = this.c;
                    hie hieVar3 = (hie) this.a;
                    ((hhu) obj4).f(hieVar3, key, Long.parseLong(value.toString()), lmxVar, lmxVar2);
                } else if (value instanceof Float) {
                    Object obj5 = this.c;
                    hie hieVar4 = (hie) this.a;
                    ((hhu) obj5).e(hieVar4, key, ((Float) value).doubleValue(), lmxVar, lmxVar2);
                } else if (value instanceof Double) {
                    Object obj6 = this.c;
                    hie hieVar5 = (hie) this.a;
                    ((hhu) obj6).e(hieVar5, key, ((Double) value).doubleValue(), lmxVar, lmxVar2);
                }
            }
        }
    }

    public final void k(gxx gxxVar) {
        int andIncrement = ((AtomicInteger) this.c).getAndIncrement() % 64;
        synchronized (this.a) {
            ((gxx[]) this.b)[andIncrement] = gxxVar;
        }
    }

    public final Object l(Object obj, Object... objArr) {
        try {
            Method q = q(obj.getClass());
            if (q == null) {
                Object obj2 = this.b;
                String valueOf = String.valueOf(obj);
                throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + valueOf);
            }
            try {
                return q.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(q.toString()));
                assertionError.initCause(e);
                throw assertionError;
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean m(Object obj) {
        return q(obj.getClass()) != null;
    }

    public final void n(Object obj, Object... objArr) {
        try {
            Method q = q(obj.getClass());
            if (q == null) {
                return;
            }
            try {
                q.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public dsl(Context context, View view) {
        this.a = gqn.b(gqn.c(context.getString(R.string.f153860_resource_name_obfuscated_res_0x7f140327)), new iay(-10066, null, null), true);
        this.b = (ViewGroup) view.findViewById(R.id.f130710_resource_name_obfuscated_res_0x7f0b2202);
        this.c = (AppCompatTextView) view.findViewById(R.id.f130890_resource_name_obfuscated_res_0x7f0b2219);
    }

    public dsl() {
        this.b = new gxx[64];
        this.a = new Object();
        this.c = new AtomicInteger(0);
    }

    public dsl(hls hlsVar, jav javVar) {
        this.b = hlsVar;
        Locale q = javVar.q();
        this.a = BreakIterator.getWordInstance(q);
        this.c = BreakIterator.getSentenceInstance(q);
    }
}
