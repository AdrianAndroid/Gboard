package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import com.google.android.libraries.assistant.soda.Soda;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gnq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gnq implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gnq(InputConnection inputConnection, ExtractedTextRequest extractedTextRequest, int i) {
        this.c = i;
        this.a = inputConnection;
        this.b = extractedTextRequest;
    }

    public /* synthetic */ gnq(gic gicVar, InputStream inputStream, int i) {
        this.c = i;
        this.b = gicVar;
        this.a = inputStream;
    }

    public /* synthetic */ gnq(gwk gwkVar, String str, int i) {
        this.c = i;
        this.b = gwkVar;
        this.a = str;
    }

    public /* synthetic */ gnq(gxe gxeVar, Object[] objArr, int i) {
        this.c = i;
        this.b = gxeVar;
        this.a = objArr;
    }

    public /* synthetic */ gnq(hat hatVar, hax haxVar, int i) {
        this.c = i;
        this.b = hatVar;
        this.a = haxVar;
    }

    public /* synthetic */ gnq(hul hulVar, List list, int i) {
        this.c = i;
        this.b = hulVar;
        this.a = list;
    }

    public /* synthetic */ gnq(igk igkVar, Context context, int i) {
        this.c = i;
        this.a = igkVar;
        this.b = context;
    }

    public /* synthetic */ gnq(Class cls, gnk gnkVar, int i) {
        this.c = i;
        this.a = cls;
        this.b = gnkVar;
    }

    public /* synthetic */ gnq(Collection collection, Map map, int i) {
        this.c = i;
        this.b = collection;
        this.a = map;
    }

    public /* synthetic */ gnq(List list, hdl hdlVar, int i) {
        this.c = i;
        this.a = list;
        this.b = hdlVar;
    }

    public /* synthetic */ gnq(List list, jsr jsrVar, int i) {
        this.c = i;
        this.a = list;
        this.b = jsrVar;
    }

    public /* synthetic */ gnq(jqx jqxVar, int i) {
        this.c = i;
        this.b = jqxVar;
        this.a = "delight";
    }

    public /* synthetic */ gnq(jqx jqxVar, int i, byte[] bArr) {
        this.c = i;
        this.b = jqxVar;
        this.a = "bundled_delight";
    }

    public /* synthetic */ gnq(jqx jqxVar, Collection collection, int i) {
        this.c = i;
        this.b = jqxVar;
        this.a = collection;
    }

    public /* synthetic */ gnq(kle kleVar, klf klfVar, int i) {
        this.c = i;
        this.b = kleVar;
        this.a = klfVar;
    }

    public /* synthetic */ gnq(knn knnVar, List list, int i) {
        this.c = i;
        this.b = knnVar;
        this.a = list;
    }

    public /* synthetic */ gnq(lbh lbhVar, lbb lbbVar, int i) {
        this.c = i;
        this.a = lbhVar;
        this.b = lbbVar;
    }

    public /* synthetic */ gnq(String[] strArr, String str, int i) {
        this.c = i;
        this.a = strArr;
        this.b = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [ngz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gnk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [ngz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [jan] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2;
        gyi a;
        boolean l;
        String[] strArr;
        char c;
        Pattern pattern;
        llp g;
        SparseArray sparseArray;
        Object obj;
        ict ictVar;
        File[] listFiles;
        int i3;
        Object obj2 = null;
        int i4 = 1;
        switch (this.c) {
            case 0:
                Object obj3 = this.a;
                ?? r2 = this.b;
                Class a2 = gno.a((Class) obj3);
                try {
                    return r2.a();
                } finally {
                    gno.a(a2);
                }
            case 1:
                Object obj4 = this.b;
                Object obj5 = this.a;
                gic gicVar = (gic) obj4;
                Soda soda = gicVar.c;
                mld mldVar = gicVar.f;
                int i5 = gicVar.d;
                if (i5 == 0 || (i2 = gicVar.e) < 8000 || i2 > 384000) {
                    ((ltd) ((ltd) gic.a.c()).k("com/google/android/libraries/assistant/soda/SodaAudioPusher", "getAudioReadSize", 67, "SodaAudioPusher.java")).t("Incorrect Format set");
                    i = 0;
                } else {
                    i = (i5 + i5) * (i2 / 1000) * 10;
                }
                gic.b(soda, (InputStream) obj5, mldVar, i);
                return null;
            case 2:
                Object obj6 = this.b;
                File file = new File(((gwk) obj6).d.b, (String) this.a);
                if (file.isFile()) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        long length = randomAccessFile.length() - 4;
                        randomAccessFile.seek(length);
                        long readInt = randomAccessFile.readInt();
                        randomAccessFile.close();
                        if (readInt == length) {
                            try {
                                InputStream c2 = lyp.c(new FileInputStream(file), file.length() - 4);
                                Object a3 = ((gwk) obj6).c.a(c2);
                                c2.close();
                                return a3;
                            } catch (IOException e) {
                                ((ltd) ((ltd) ((ltd) gwk.a.c()).i(e)).k("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 104, "FileCache.java")).w("Failed to deserialize file: %s", file);
                            }
                        }
                    } catch (IOException unused) {
                    }
                    jan.b.e(file);
                    ((ltd) ((ltd) gwk.a.c()).k("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 96, "FileCache.java")).w("Delete malformed file: %s", file);
                }
                return null;
            case 3:
                Object obj7 = this.b;
                Void[] voidArr = (Void[]) this.a;
                gyh gyhVar = (gyh) obj7;
                ((luc) ((luc) gyhVar.f.e.b()).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager$ImportContentTask", "doInBackground", 249, "AbstractContentDataManager.java")).t("doInBackground()");
                ieh.j().e(gyhVar.f.g(), new Object[0]);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                gyj gyjVar = gyhVar.f;
                Context context = gyjVar.d;
                List<gyg> list = gyhVar.e;
                try {
                    for (gyg gygVar : list) {
                        gygVar.g();
                    }
                    a = gyjVar.p(context, list, (gxe) obj7);
                } catch (RuntimeException e2) {
                    ((luc) ((luc) ((luc) gyjVar.e.d()).i(e2)).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager", "importContentData", (char) 284, "AbstractContentDataManager.java")).t("importContentData() : Failed to begin import");
                    a = gyi.a(1, 0);
                }
                gyi gyiVar = a;
                int intValue = gyiVar.a.intValue();
                try {
                    ((luc) ((luc) gyjVar.e.b()).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager", "importContentData", 289, "AbstractContentDataManager.java")).t("importContentData() : Ending import process");
                    for (gyg gygVar2 : list) {
                        if (intValue == 0) {
                            gygVar2.b();
                        } else {
                            gygVar2.c();
                        }
                    }
                } catch (RuntimeException e3) {
                    ((luc) ((luc) ((luc) gyjVar.e.d()).i(e3)).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager", "importContentData", (char) 298, "AbstractContentDataManager.java")).t("importContentData() : Failed to end import");
                }
                ieh.j().g(gyhVar.f.h(), SystemClock.elapsedRealtime() - elapsedRealtime);
                return gyiVar;
            case 4:
                Object obj8 = this.b;
                ?? r22 = this.a;
                synchronized (((hat) obj8).e) {
                    l = hat.b.l(((hat) obj8).g, r22);
                }
                if (!l) {
                    throw new IOException("Failed to write sticky preferences to disk");
                }
                return null;
            case 5:
                Object obj9 = this.a;
                ?? r3 = this.b;
                Pattern pattern2 = hey.a;
                llk e4 = llp.e();
                for (String str : (String[]) obj9) {
                    switch (str.hashCode()) {
                        case -1034364087:
                            if (str.equals("number")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 116079:
                            if (str.equals("url")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 96619420:
                            if (str.equals("email")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106642798:
                            if (str.equals("phone")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        pattern = xw.f;
                    } else if (c == 1) {
                        pattern = xw.c;
                    } else if (c != 2) {
                        pattern = c != 3 ? null : hey.b;
                    } else {
                        pattern = hey.a;
                    }
                    if (pattern == null) {
                        g = llp.q();
                    } else {
                        llk e5 = llp.e();
                        int b = hgw.b(str);
                        if (b == 3) {
                            Matcher matcher = pattern.matcher(r3);
                            while (matcher.find()) {
                                String group = matcher.group(0);
                                if (!TextUtils.isEmpty(group)) {
                                    e5.h(hey.a(group, 3, matcher.start()));
                                }
                            }
                        } else {
                            Matcher matcher2 = hey.c.matcher(String.valueOf((Object) r3).concat("\n"));
                            int i6 = 0;
                            while (matcher2.find()) {
                                String substring = ((String) r3).substring(i6, matcher2.start());
                                if (!TextUtils.isEmpty(substring) && pattern.matcher(substring).matches()) {
                                    e5.h(hey.a(substring, b, i6));
                                }
                                i6 = matcher2.end();
                            }
                        }
                        g = e5.g();
                    }
                    e4.j(g);
                }
                return e4.g();
            case 6:
                ?? r0 = this.a;
                Object obj10 = this.b;
                ltg ltgVar = hpr.a;
                return hpw.a(r0, (ExtractedTextRequest) obj10, 0);
            case 7:
                Object obj11 = this.b;
                Object obj12 = this.a;
                SparseArray sparseArray2 = ((hul) obj11).b.h.b;
                ibd a4 = ibi.a();
                int size = sparseArray2.size();
                int i7 = 0;
                Object obj13 = obj12;
                while (i7 < size) {
                    int keyAt = sparseArray2.keyAt(i7);
                    icy icyVar = (icy) sparseArray2.valueAt(i7);
                    if (Thread.interrupted()) {
                        return obj2;
                    }
                    int i8 = 0;
                    ?? r23 = obj13;
                    while (i8 < icyVar.a.length) {
                        ict ictVar2 = ((ict[]) icyVar.b)[i8];
                        if (ictVar2 == null || ictVar2.c == 0 || r23.isEmpty()) {
                            sparseArray = sparseArray2;
                            obj = r23;
                        } else {
                            long j = icyVar.a[i8];
                            ict ictVar3 = ictVar2;
                            Object obj14 = r23;
                            for (icf icfVar : r23) {
                                ibi ibiVar = icfVar.h;
                                int i9 = ictVar2.c;
                                SparseArray sparseArray3 = sparseArray2;
                                int size2 = ibiVar.b.size();
                                Object obj15 = obj14;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size2) {
                                        int i11 = size2;
                                        ictVar = (ict) ((icy) ibiVar.b.valueAt(i10)).c(j);
                                        ibi ibiVar2 = ibiVar;
                                        if (ictVar == null || ictVar.c != i9) {
                                            i10++;
                                            size2 = i11;
                                            ibiVar = ibiVar2;
                                        }
                                    } else {
                                        ictVar = null;
                                    }
                                }
                                if (ictVar == null || Arrays.equals(ictVar2.m, ictVar.m)) {
                                    i4 = 1;
                                } else {
                                    ico d = ict.d();
                                    d.i(ictVar3);
                                    i4 = 1;
                                    d.l(ictVar.m, true);
                                    ictVar3 = d.c();
                                }
                                sparseArray2 = sparseArray3;
                                obj14 = obj15;
                            }
                            sparseArray = sparseArray2;
                            obj = obj14;
                            ictVar2 = ictVar3;
                        }
                        long[] jArr = new long[i4];
                        jArr[0] = icyVar.a[i8];
                        a4.e(keyAt, ictVar2, jArr);
                        i8++;
                        sparseArray2 = sparseArray;
                        r23 = obj;
                        i4 = 1;
                    }
                    i7++;
                    obj2 = null;
                    i4 = 1;
                    obj13 = r23;
                }
                return a4.a();
            case 8:
                return ian.c(this.a, (hdl) this.b, Integer.MAX_VALUE);
            case 9:
                Object obj16 = this.a;
                Object obj17 = this.b;
                ((igk) obj16).a.b.getSimpleName();
                ((igk) obj16).a.a.getSimpleName();
                ((igk) obj16).a.b.getSimpleName();
                ifw a5 = ((igk) obj16).b.a((Context) obj17);
                if (!((igk) obj16).a.b.isAssignableFrom(a5.getClass())) {
                    return null;
                }
                a5.gm((Context) obj17, ((igk) obj16).a);
                return a5;
            case 10:
                Object obj18 = this.b;
                Object obj19 = this.a;
                jqx jqxVar = (jqx) obj18;
                jqxVar.j();
                return jqxVar.b.c((String) obj19);
            case 11:
                Object obj20 = this.b;
                Object obj21 = this.a;
                lug lugVar = jsh.a;
                jqx jqxVar2 = (jqx) obj20;
                jqxVar2.j();
                jqxVar2.i((String) obj21);
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj22 = this.b;
                ?? r24 = this.a;
                ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$deletePacks$18", 1002, "Superpacks.java")).w("Deleting packs: %s", jtq.h(r24, jky.h));
                jqx jqxVar3 = (jqx) obj22;
                jqxVar3.j();
                for (jsr jsrVar : r24) {
                    jvr jvrVar = jqxVar3.f;
                    lug lugVar2 = jsh.a;
                    File i12 = jvrVar.i(jsrVar.b());
                    if (i12.exists() && (listFiles = i12.listFiles(new jvp(jsrVar.a(), 0))) != null) {
                        for (File file2 : listFiles) {
                            jvrVar.r(jsr.d(jsrVar.b(), file2.getName()), jxz.DELETE_PACKS, false);
                        }
                    }
                }
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                jro.b(this.a, "Cancellation request for pack '%s' failed", this.b);
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ?? r02 = this.b;
                Object obj23 = this.a;
                lug lugVar3 = jsh.a;
                r02.size();
                return obj23;
            case 15:
                Object obj24 = this.b;
                ?? r03 = this.a;
                nrw nrwVar = new nrw();
                try {
                    kcq g2 = ((kle) obj24).a.g();
                    Uri uri = ((kle) obj24).b;
                    kpr kprVar = new kpr(r03);
                    kprVar.a = new nrw[]{nrwVar};
                    Void r04 = (Void) g2.q(uri, kprVar);
                } catch (IOException | RuntimeException e6) {
                    Log.w("SnapshotHandler", "Failed to update snapshot for " + ((kle) obj24).c + " flags may be stale.", e6);
                }
                return null;
            case 16:
                Object obj25 = this.b;
                for (String str2 : this.a) {
                    ((knn) obj25).g.b(str2, true);
                }
                kcq kcqVar = ((knn) obj25).g;
                synchronized (kcqVar.b) {
                    ((knr) kcqVar.b).c(true);
                }
                return null;
            default:
                Object obj26 = this.a;
                Object obj27 = this.b;
                long j2 = lbs.a;
                if (obj26 == null || (i3 = ((lbh) obj26).b) == 0 || i3 == 5 || i3 == 6 || i3 == 7) {
                    return lbh.a(obj26 == null ? 1 : ((lbh) obj26).a + 1, 1, 0, 0L, 0L, ((lbb) obj27).a, new ArrayList());
                }
                throw new lau(-1);
        }
    }
}
