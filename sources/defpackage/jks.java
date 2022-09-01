package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jks  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jks implements leq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jks(SharedPreferences sharedPreferences, int i) {
        this.b = i;
        this.a = sharedPreferences;
    }

    public /* synthetic */ jks(Boolean bool, int i) {
        this.b = i;
        this.a = bool;
    }

    public /* synthetic */ jks(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ jks(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public /* synthetic */ jks(AtomicReference atomicReference, int i) {
        this.b = i;
        this.a = atomicReference;
    }

    public /* synthetic */ jks(jig jigVar, int i) {
        this.b = i;
        this.a = jigVar;
    }

    public /* synthetic */ jks(jil jilVar, int i) {
        this.b = i;
        this.a = jilVar;
    }

    public /* synthetic */ jks(jla jlaVar, int i) {
        this.b = i;
        this.a = jlaVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                if (((jkj) obj) == jkj.DOWNLOADED) {
                    jig jigVar = (jig) obj2;
                    String str = jigVar.c;
                    int i = jigVar.e;
                    long j = jigVar.q;
                    String str2 = jigVar.r;
                }
                return true;
            case 1:
                Object obj3 = this.a;
                if (!((Boolean) obj).booleanValue() || !((Boolean) obj3).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                ?? r0 = this.a;
                Void r13 = (Void) obj;
                boolean z2 = jkv.a;
                r0.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                return null;
            case 3:
                return (jir) Collections.unmodifiableMap(((jio) obj).b).get(this.a);
            case 4:
                Void r132 = (Void) obj;
                return this.a;
            case 5:
                ?? r02 = this.a;
                jio jioVar = (jio) obj;
                nfh nfhVar = (nfh) jioVar.N(5);
                nfhVar.cG(jioVar);
                for (jiq jiqVar : r02) {
                    String str3 = jiqVar.b;
                    String str4 = jiqVar.c;
                    int i2 = jmk.a;
                    nfhVar.da(lre.av(jiqVar));
                }
                return (jio) nfhVar.cz();
            case 6:
                Object obj4 = this.a;
                jio jioVar2 = (jio) obj;
                nfh nfhVar2 = (nfh) jioVar2.N(5);
                nfhVar2.cG(jioVar2);
                nfhVar2.da((String) obj4);
                return (jio) nfhVar2.cz();
            case 7:
                ?? r03 = this.a;
                jio jioVar3 = (jio) obj;
                nfh nfhVar3 = (nfh) jioVar3.N(5);
                nfhVar3.cG(jioVar3);
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                jio jioVar4 = (jio) nfhVar3.b;
                jio jioVar5 = jio.d;
                nga ngaVar = jioVar4.c;
                if (!ngaVar.c()) {
                    jioVar4.c = nfm.H(ngaVar);
                }
                ndt.cs(r03, jioVar4.c);
                return (jio) nfhVar3.cz();
            case 8:
                return (jig) Collections.unmodifiableMap(((jio) obj).a).get(this.a);
            case 9:
                ?? r04 = this.a;
                jio jioVar6 = (jio) obj;
                nfh nfhVar4 = (nfh) jioVar6.N(5);
                nfhVar4.cG(jioVar6);
                for (String str5 : Collections.unmodifiableMap(jioVar6.a).keySet()) {
                    try {
                        r04.add(lre.at(str5));
                    } catch (jmq e) {
                        jmk.h(e, "Failed to deserialize groupKey:".concat(String.valueOf(str5)));
                        nfhVar4.da(str5);
                    }
                }
                return (jio) nfhVar4.cz();
            case 10:
                Void r133 = (Void) obj;
                return this.a;
            case 11:
                ?? r05 = this.a;
                jio jioVar7 = (jio) obj;
                nfh nfhVar5 = (nfh) jioVar7.N(5);
                nfhVar5.cG(jioVar7);
                for (Map.Entry entry : Collections.unmodifiableMap(jioVar7.a).entrySet()) {
                    String str6 = (String) entry.getKey();
                    try {
                        r05.add(jlq.a(lre.at(str6), (jig) entry.getValue()));
                    } catch (jmq e2) {
                        nfhVar5.da(str6);
                        jmk.h(e2, "Failed to deserialized file group key: ".concat(String.valueOf(str6)));
                    }
                }
                return (jio) nfhVar5.cz();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.a;
                jiw jiwVar = (jiw) obj;
                nfh nfhVar6 = (nfh) jiwVar.N(5);
                nfhVar6.cG(jiwVar);
                nfhVar6.dc((String) obj5);
                return (jiw) nfhVar6.cz();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Void r134 = (Void) obj;
                return (List) ((AtomicReference) this.a).get();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj6 = this.a;
                jiw jiwVar2 = (jiw) obj;
                int i3 = jmk.a;
                nfh nfhVar7 = (nfh) jiwVar2.N(5);
                nfhVar7.cG(jiwVar2);
                for (String str7 : Collections.unmodifiableMap(jiwVar2.a).keySet()) {
                    try {
                        jit C = jez.C(str7, ((jla) obj6).a);
                        str7.getClass();
                        ngu nguVar = jiwVar2.a;
                        jiu jiuVar = nguVar.containsKey(str7) ? (jiu) nguVar.get(str7) : null;
                        nfhVar7.dc(str7);
                        if (jiuVar == null) {
                            jmk.b("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            nfhVar7.db(jez.B(C), jiuVar);
                        }
                    } catch (jms unused) {
                        jmk.c("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str7);
                        nfhVar7.dc(str7);
                    }
                }
                return (jiw) nfhVar7.cz();
            case 15:
                return (jiu) Collections.unmodifiableMap(((jiw) obj).a).get(this.a);
            case 16:
                Object obj7 = this.a;
                jiw jiwVar3 = (jiw) obj;
                int i4 = jmk.a;
                nfh nfhVar8 = (nfh) jiwVar3.N(5);
                nfhVar8.cG(jiwVar3);
                for (String str8 : Collections.unmodifiableMap(jiwVar3.a).keySet()) {
                    try {
                        jit C2 = jez.C(str8, ((jla) obj7).a);
                        str8.getClass();
                        ngu nguVar2 = jiwVar3.a;
                        jiu jiuVar2 = nguVar2.containsKey(str8) ? (jiu) nguVar2.get(str8) : null;
                        nfhVar8.dc(str8);
                        if (jiuVar2 == null) {
                            jmk.b("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            nfhVar8.db(jez.A(C2), jiuVar2);
                        }
                    } catch (jms unused2) {
                        jmk.c("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str8);
                        nfhVar8.dc(str8);
                    }
                }
                return (jiw) nfhVar8.cz();
            case 17:
                Object obj8 = this.a;
                Void r135 = (Void) obj;
                int i5 = jmn.d;
                return (List) ((AtomicReference) obj8).get();
            case 18:
                Object obj9 = this.a;
                Void r136 = (Void) obj;
                int i6 = jmn.d;
                return (lfb) ((AtomicReference) obj9).get();
            case 19:
                Object obj10 = this.a;
                jis jisVar = (jis) obj;
                int i7 = jmn.d;
                jil jilVar = (jil) obj10;
                int X = lre.X(jisVar.c, new jcf(jilVar, 2));
                if (X == -1) {
                    nfh nfhVar9 = (nfh) jisVar.N(5);
                    nfhVar9.cG(jisVar);
                    if (nfhVar9.c) {
                        nfhVar9.cD();
                        nfhVar9.c = false;
                    }
                    jis jisVar2 = (jis) nfhVar9.b;
                    obj10.getClass();
                    jisVar2.b();
                    jisVar2.c.add(obj10);
                    return (jis) nfhVar9.cz();
                }
                jil jilVar2 = (jil) jisVar.c.get(X);
                nfh nfhVar10 = (nfh) jilVar2.N(5);
                nfhVar10.cG(jilVar2);
                long j2 = jilVar2.f + jilVar.f;
                if (nfhVar10.c) {
                    nfhVar10.cD();
                    nfhVar10.c = false;
                }
                jil jilVar3 = (jil) nfhVar10.b;
                int i8 = jilVar3.a | 16;
                jilVar3.a = i8;
                jilVar3.f = j2;
                long j3 = jilVar2.g;
                long j4 = jilVar.g;
                jilVar3.a = i8 | 32;
                jilVar3.g = j3 + j4;
                jil jilVar4 = (jil) nfhVar10.cz();
                nfh nfhVar11 = (nfh) jisVar.N(5);
                nfhVar11.cG(jisVar);
                if (nfhVar11.c) {
                    nfhVar11.cD();
                    nfhVar11.c = false;
                }
                jis jisVar3 = (jis) nfhVar11.b;
                jilVar4.getClass();
                jisVar3.b();
                jisVar3.c.set(X, jilVar4);
                return (jis) nfhVar11.cz();
            default:
                Object obj11 = this.a;
                jis jisVar4 = (jis) obj;
                int i9 = jmn.d;
                ((AtomicReference) obj11).set(jisVar4.c);
                nfh nfhVar12 = (nfh) jisVar4.N(5);
                nfhVar12.cG(jisVar4);
                if (nfhVar12.c) {
                    nfhVar12.cD();
                    nfhVar12.c = false;
                }
                ((jis) nfhVar12.b).c = jis.G();
                return (jis) nfhVar12.cz();
        }
    }
}
