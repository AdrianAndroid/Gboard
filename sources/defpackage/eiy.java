package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.learning.dynamite.training.InAppTrainerImpl;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eiy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eiy implements leq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ eiy(Context context, dpe dpeVar, his hisVar, his hisVar2, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.a = context;
        this.b = dpeVar;
        this.c = hisVar;
        this.d = hisVar2;
    }

    public /* synthetic */ eiy(InAppTrainerImpl inAppTrainerImpl, gbx gbxVar, fwe fweVar, Context context, int i) {
        this.e = i;
        this.c = inAppTrainerImpl;
        this.d = gbxVar;
        this.b = fweVar;
        this.a = context;
    }

    public /* synthetic */ eiy(hhu hhuVar, lmx lmxVar, lmx lmxVar2, idn idnVar, int i) {
        this.e = i;
        this.a = hhuVar;
        this.c = lmxVar;
        this.d = lmxVar2;
        this.b = idnVar;
    }

    public /* synthetic */ eiy(hrc hrcVar, iaw iawVar, hra hraVar, gvy gvyVar, int i) {
        this.e = i;
        this.c = hrcVar;
        this.d = iawVar;
        this.b = hraVar;
        this.a = gvyVar;
    }

    public /* synthetic */ eiy(idk idkVar, cvx cvxVar, cqu cquVar, Executor executor, int i) {
        this.e = i;
        this.c = idkVar;
        this.b = cvxVar;
        this.a = cquVar;
        this.d = executor;
    }

    public /* synthetic */ eiy(itv itvVar, String str, byte[] bArr, byte[] bArr2, int i) {
        this.e = i;
        this.a = itvVar;
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [idk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [his, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        nem nemVar;
        int i = this.e;
        if (i == 0) {
            return new ejb((Context) this.a, (View) obj, (dpe) this.b, this.c, this.d, null, null);
        }
        int i2 = 1;
        if (i == 1) {
            ?? r0 = this.c;
            Object obj2 = this.b;
            Object obj3 = this.a;
            ?? r4 = this.d;
            idn a = r0.a(cjk.c);
            hiz v = ((cvx) obj2).m((String) obj, Math.max(0, ((Long) cit.B.c()).intValue()), true).v(new bzf((cqu) obj3, 16), r4);
            Objects.requireNonNull(a);
            v.d(new cbq(a, 8), mjl.a);
            return v;
        }
        int i3 = 3;
        int i4 = 2;
        if (i == 2) {
            Object obj4 = this.c;
            Object obj5 = this.d;
            ?? r3 = this.b;
            Object obj6 = this.a;
            RuntimeException runtimeException = (RuntimeException) obj;
            ((gbx) obj5).o(3, lfb.g(mge.ERROR_REASON_RUNTIME_EXCEPTION), lfb.g(((InAppTrainerImpl) obj4).d));
            if (r3.aK()) {
                fyb.y((Context) obj6, runtimeException);
            }
            throw runtimeException;
        } else if (i == 3) {
            Object obj7 = this.c;
            Object obj8 = this.d;
            ?? r32 = this.b;
            Object obj9 = this.a;
            RuntimeException runtimeException2 = (RuntimeException) obj;
            ((gbx) obj8).o(2, lfb.g(mge.ERROR_REASON_RUNTIME_EXCEPTION), lfb.g(((InAppTrainerImpl) obj7).d));
            if (r32.aK()) {
                fyb.y((Context) obj9, runtimeException2);
            }
            throw runtimeException2;
        } else if (i == 4) {
            Object obj10 = this.a;
            Object obj11 = this.c;
            Object obj12 = this.d;
            Object obj13 = this.b;
            for (hif hifVar : Collections.unmodifiableMap(((hij) obj).a).values()) {
                String str = hifVar.b;
                Map unmodifiableMap = Collections.unmodifiableMap(hifVar.d);
                if (!TextUtils.isEmpty(str) && !unmodifiableMap.isEmpty()) {
                    for (Map.Entry entry : unmodifiableMap.entrySet()) {
                        hie b = hie.b(((Integer) entry.getKey()).intValue());
                        hih hihVar = (hih) entry.getValue();
                        if (b != null && b != hie.DEFAULT && hihVar != null) {
                            hig higVar = hig.BOOL_VALUE;
                            int ordinal = hig.a(hihVar.a).ordinal();
                            if (ordinal == 0) {
                                String str2 = str;
                                boolean booleanValue = hihVar.a == 1 ? ((Boolean) hihVar.b).booleanValue() : false;
                                str = str2;
                                ((hhu) obj10).c(b, str, booleanValue, (lmx) obj11, (lmx) obj12);
                            } else if (ordinal == i2) {
                                String str3 = str;
                                long longValue = hihVar.a == 2 ? ((Long) hihVar.b).longValue() : 0L;
                                str = str3;
                                ((hhu) obj10).f(b, str, longValue, (lmx) obj11, (lmx) obj12);
                            } else if (ordinal == i4) {
                                String str4 = str;
                                double doubleValue = hihVar.a == 3 ? ((Double) hihVar.b).doubleValue() : 0.0d;
                                str = str4;
                                ((hhu) obj10).e(b, str, doubleValue, (lmx) obj11, (lmx) obj12);
                            } else if (ordinal == i3) {
                                String str5 = str;
                                String str6 = hihVar.a == 4 ? (String) hihVar.b : "";
                                str = str5;
                                ((hhu) obj10).g(b, str, str6, (lmx) obj11, (lmx) obj12);
                            } else if (ordinal == 4) {
                                if (hihVar.a == 5) {
                                    nemVar = (nem) hihVar.b;
                                } else {
                                    nemVar = nem.b;
                                }
                                ((hhu) obj10).d(b, str, nemVar.D(), (lmx) obj11, (lmx) obj12);
                            } else {
                                ((ltd) ((ltd) hhu.a.c()).k("com/google/android/libraries/inputmethod/flag/FlagManager", "readFlag", 862, "FlagManager.java")).G("Unknown type %s for flag: %s", hig.a(hihVar.a), str);
                            }
                            i2 = 1;
                            i3 = 3;
                            i4 = 2;
                        }
                    }
                }
            }
            return obj13;
        } else {
            if (i != 5) {
                Object obj14 = this.a;
                Object obj15 = this.b;
                Object obj16 = this.c;
                Object obj17 = this.d;
                ltg ltgVar = its.a;
                itt ittVar = (itt) ((itv) obj14).c.a((ixe) obj);
                try {
                    ittVar.c((String) obj15, (byte[]) obj16, (byte[]) obj17);
                    return ittVar;
                } catch (Throwable th) {
                    gvt.a(ittVar);
                    throw th;
                }
            }
            Object obj18 = this.c;
            Object obj19 = this.d;
            Object obj20 = this.b;
            Object obj21 = this.a;
            List list = (List) obj;
            boolean z = true;
            for (int i5 = 0; i5 < list.size(); i5++) {
                List<iav> list2 = (List) list.get(i5);
                if (list2 == null || list2.isEmpty()) {
                    ((ltd) ((ltd) hrc.a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/ImeDefCache", "lambda$loadImeDefs$2", 261, "ImeDefCache.java")).z("Provider %d: No ImeDefs for language %s", i5, ((iaw) obj19).a);
                    z = false;
                } else {
                    int a2 = ((gvy) obj21).a(i5);
                    for (iav iavVar : list2) {
                        String str7 = iavVar.f.c;
                        hra hraVar = (hra) obj20;
                        if (hraVar.a.put(str7, iavVar) == null) {
                            hraVar.b.add(str7);
                        }
                    }
                    ((hra) obj20).c.b(a2);
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                ((hrc) obj18).e.l(7);
            }
            hra hraVar2 = (hra) obj20;
            hraVar2.d = z;
            return new hrb(hraVar2);
        }
    }
}
