package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.trainingcache.ekho.LearningController;
import com.google.android.keyboard.client.delight5.ConceptPredictionApi;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.android.libraries.inputmethod.cache.module.AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner;
import j$.nio.charset.StandardCharsets;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: evl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class evl implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ evl(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ evl(AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner autoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner, int i) {
        this.b = i;
        this.a = autoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner;
    }

    public /* synthetic */ evl(eal ealVar, int i) {
        this.b = i;
        this.a = ealVar;
    }

    public /* synthetic */ evl(evn evnVar, int i) {
        this.b = i;
        this.a = evnVar;
    }

    public /* synthetic */ evl(evq evqVar, int i) {
        this.b = i;
        this.a = evqVar;
    }

    public /* synthetic */ evl(ewb ewbVar, int i) {
        this.b = i;
        this.a = ewbVar;
    }

    public /* synthetic */ evl(exa exaVar, int i) {
        this.b = i;
        this.a = exaVar;
    }

    public /* synthetic */ evl(fjn fjnVar, int i) {
        this.b = i;
        this.a = fjnVar;
    }

    public /* synthetic */ evl(gwk gwkVar, int i) {
        this.b = i;
        this.a = gwkVar;
    }

    public /* synthetic */ evl(hat hatVar, int i) {
        this.b = i;
        this.a = hatVar;
    }

    public /* synthetic */ evl(hbj hbjVar, int i) {
        this.b = i;
        this.a = hbjVar;
    }

    public /* synthetic */ evl(hls hlsVar, int i) {
        this.b = i;
        this.a = hlsVar;
    }

    public /* synthetic */ evl(hrn hrnVar, int i) {
        this.b = i;
        this.a = hrnVar;
    }

    public /* synthetic */ evl(hzq hzqVar, int i) {
        this.b = i;
        this.a = hzqVar;
    }

    public /* synthetic */ evl(ifn ifnVar, int i) {
        this.b = i;
        this.a = ifnVar;
    }

    public /* synthetic */ evl(itt ittVar, int i) {
        this.b = i;
        this.a = ittVar;
    }

    public /* synthetic */ evl(llw llwVar, int i) {
        this.b = i;
        this.a = llwVar;
    }

    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, hls] */
    /* JADX WARN: Type inference failed for: r0v99, types: [itt, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        evr[] values;
        lfb lfbVar;
        ZipEntry nextEntry;
        r4 = false;
        boolean z = false;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                EkhoMaintenance a = ((evn) obj).a();
                try {
                    a.c((nnf) ((evn) obj).b.a());
                    nnd nndVar = (nnd) EkhoMaintenance.b(EkhoMaintenance.nativeCleanUp(a.a()), nnd.f);
                    ((evn) obj).c.e(evu.CLEANUP_CYCLE_LENGTH, Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(nndVar.e)));
                    ((evn) obj).c.e(evu.CLEANUP_NUM_EVENTS_CACHED, Long.valueOf(nndVar.a));
                    ((evn) obj).c.e(evu.CLEANUP_NUM_EVENTS_DELETED, Long.valueOf(nndVar.b));
                    ((evn) obj).c.e(evu.CLEANUP_NUM_BYTES_CACHED, Long.valueOf(nndVar.c));
                    ((evn) obj).c.e(evu.CLEANUP_NUM_BYTES_DELETED, Long.valueOf(nndVar.d));
                    a.close();
                    return null;
                } finally {
                    try {
                        a.close();
                    } catch (Throwable th) {
                        eyh.d(th, th);
                    }
                }
            case 1:
                Object obj2 = this.a;
                String h = cnx.h();
                eal ealVar = (eal) obj2;
                kcq kcqVar = (kcq) ealVar.f.a();
                llp q = !kcqVar.F() ? llp.q() : llp.p(((ConceptPredictionApi) kcqVar.b).conceptPredictionPredictConcepts(h));
                int intValue = ((Long) eal.a.c()).intValue();
                long longValue = ((Long) eal.b.c()).longValue();
                ArrayList arrayList = new ArrayList();
                if (intValue == 2) {
                    List list = (List) Collection$EL.stream(q).flatMap(new chd(ealVar, 8)).collect(Collectors.toCollection(cag.h));
                    Collections.shuffle(list);
                    return (llp) Collection$EL.stream(list).limit(longValue).collect(ljr.a);
                }
                int i = ((lrl) q).c;
                for (int i2 = 0; i2 < i; i2++) {
                    String str = (String) q.get(i2);
                    if (arrayList.size() >= longValue) {
                        return (llp) Collection$EL.stream(arrayList).distinct().limit(longValue).collect(ljr.a);
                    }
                    List b = ealVar.b(str);
                    if (intValue == 1) {
                        Collections.shuffle(b);
                    }
                    arrayList.addAll(b);
                }
                return (llp) Collection$EL.stream(arrayList).distinct().limit(longValue).collect(ljr.a);
            case 2:
                Object obj3 = this.a;
                EkhoMaintenance a2 = ((evn) obj3).a();
                try {
                    a2.c((nnf) ((evn) obj3).b.a());
                    nnc nncVar = (nnc) EkhoMaintenance.b(EkhoMaintenance.nativeGetCacheMetrics(a2.a()), nnc.d);
                    ((evn) obj3).c.e(evu.POLICY_CONFIG_VERSION, Integer.valueOf(nncVar.a));
                    idk idkVar = ((evn) obj3).c;
                    evu evuVar = evu.TOTAL_SIZE_KB;
                    Object[] objArr = new Object[1];
                    gvu gvuVar = gvu.BYTES;
                    nnh nnhVar = nncVar.b;
                    if (nnhVar == null) {
                        nnhVar = nnh.c;
                    }
                    objArr[0] = Long.valueOf(gvuVar.c(nnhVar.b));
                    idkVar.e(evuVar, objArr);
                    EnumMap enumMap = new EnumMap(nni.class);
                    for (nnj nnjVar : nncVar.c) {
                        nni b2 = nni.b(nnjVar.a);
                        if (b2 == null) {
                            b2 = nni.UNKNOWN;
                        }
                        nnh nnhVar2 = nnjVar.b;
                        if (nnhVar2 == null) {
                            nnhVar2 = nnh.c;
                        }
                        enumMap.put((EnumMap) b2, (nni) Long.valueOf(nnhVar2.a));
                    }
                    for (evr evrVar : evr.values()) {
                        Long l = (Long) enumMap.get(evrVar.c);
                        idk idkVar2 = ((evn) obj3).c;
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = Long.valueOf(l != null ? l.longValue() : 0L);
                        idkVar2.e(evrVar, objArr2);
                    }
                    a2.close();
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 3:
                evq evqVar = (evq) this.a;
                EkhoWriter ekhoWriter = evqVar.d;
                if (ekhoWriter != null) {
                    return ekhoWriter;
                }
                EkhoWriter a3 = evqVar.a();
                EkhoWriter.nativeEnableWriting(a3.a());
                EkhoWriter.nativeInit(a3.a(), ((ndu) evqVar.b.a()).q());
                evqVar.d = a3;
                return a3;
            case 4:
                ewb ewbVar = (ewb) this.a;
                LearningController learningController = ewbVar.e;
                boolean d = ewbVar.c.d();
                learningController.a();
                LearningController.nativeSetEnableSpeechCaching(d);
                return null;
            case 5:
                exa exaVar = (exa) this.a;
                return Boolean.valueOf(exaVar.d.e(exr.c(exaVar.c)));
            case 6:
                exa exaVar2 = (exa) this.a;
                return Boolean.valueOf(exaVar2.d.e(new File(exaVar2.c.getFilesDir(), "personalization/lm")));
            case 7:
                fjn fjnVar = (fjn) this.a;
                if (fjnVar.j.isEmpty() && fjnVar.p()) {
                    fjnVar.m();
                }
                return null;
            case 8:
                Object obj4 = this.a;
                try {
                    Account[] i3 = fkw.i((Context) obj4, new String[]{"HOSTED"});
                    if (i3 != null && i3.length != 0) {
                        return z2;
                    }
                    Account[] i4 = fkw.i((Context) obj4, new String[]{"uca"});
                    if (i4 != null && i4.length != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } catch (fkr | IOException e) {
                    ((ltd) ((ltd) ((ltd) gtq.a.c()).i(e)).k("com/google/android/libraries/inputmethod/accounts/checker/ManagedDeviceCheckModule", "lambda$isDasherOrUnicornAccount$1", 'd', "ManagedDeviceCheckModule.java")).t("Check for Dasher or Unicorn account failed.");
                    return z2;
                }
            case 9:
                return Boolean.valueOf(((gwk) this.a).c());
            case 10:
                gwj.e(((AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner) this.a).a);
                return isb.FINISHED;
            case 11:
                Object obj5 = this.a;
                hat hatVar = (hat) obj5;
                hat.b.b(hatVar.f.getAbsolutePath());
                hat.b.m(hatVar.f.getAbsolutePath(), "sticky_variant_prefs");
                hav havVar = hatVar.d;
                lls h2 = llw.h();
                for (String str2 : havVar.e.e("emoji_variant_prefs", lrr.a)) {
                    List k = hav.c.k(str2);
                    if (k.size() == 2) {
                        h2.a((String) k.get(0), (String) k.get(1));
                    } else {
                        ((ltd) ((ltd) hav.a.d()).k("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackup", 82, "EmojiVariantPreferencesBackupHelper.java")).w("Malformed entry in serialized emoji variant preferences: %s", str2);
                    }
                }
                llw l2 = h2.l();
                if (!l2.isEmpty()) {
                    ieh.j().e(hay.a, 1);
                }
                HashMap hashMap = new HashMap(l2);
                Object hashMap2 = new HashMap();
                synchronized (hatVar.e) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(((hat) obj5).g);
                        try {
                            hashMap2 = Collections.unmodifiableMap(((hax) nfm.x(hax.b, fileInputStream, nfb.b())).a);
                            hashMap.putAll(hashMap2);
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                } catch (Exception unused) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException e2) {
                        ((ltd) ((ltd) ((ltd) hat.a.c()).i(e2)).k("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider", "lambda$loadFromStickyPreferences$0", 'Z', "DefaultStickyPreferencesProtoProvider.java")).t("Failed to load sticky preferences from file");
                    }
                }
                nfh t = hax.b.t();
                t.cR(hashMap);
                hax haxVar = (hax) t.cz();
                if (((Boolean) hav.d.c()).booleanValue() && !lre.z(l2, hashMap2)) {
                    hatVar.a(haxVar);
                }
                return haxVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj6 = this.a;
                ltg ltgVar = hau.a;
                llk e3 = llp.e();
                llp llpVar = hdn.g(hdn.instance.h) ? hau.b : hau.c;
                int i5 = ((lrl) llpVar).c;
                for (int i6 = 0; i6 < i5; i6++) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Context) obj6).getResources().openRawResource(((Integer) llpVar.get(i6)).intValue()), StandardCharsets.UTF_8));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                List k2 = lfy.c(',').k(readLine);
                                if (k2.size() > 1) {
                                    e3.h(llp.o(k2));
                                }
                            } else {
                                bufferedReader.close();
                            }
                        }
                    } catch (IOException e4) {
                        ((ltd) ((ltd) hau.a.c()).k("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider", "lambda$loadVariantsMapsFromDisk$1", 193, "EmojiVariantDataProvider.java")).t("Failed to load emoji variation data.");
                        throw e4;
                    }
                }
                return e3.g();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                hbj hbjVar = (hbj) this.a;
                hbjVar.c.putAll(Collections.unmodifiableMap(((hax) hbjVar.e.A(hax.b)).a));
                hau hauVar = hbjVar.b;
                lmz p = lmz.p(!hauVar.f.D() ? lrr.a : ((llr) hauVar.d.get()).u());
                if (!p.containsAll(hbjVar.c.keySet())) {
                    lmz p2 = lmz.p(lvw.i(hbjVar.c.keySet(), p));
                    ((ltd) ((ltd) hbj.a.b()).k("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 177, "StickyVariantsPreferences.java")).u("Attempting to migrate %d sticky preferences to new base variant", p2.size());
                    lsz it = p2.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        String str4 = (String) hbjVar.c.get(str3);
                        if (str4 == null) {
                            ((ltd) ((ltd) hbj.a.c()).k("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 183, "StickyVariantsPreferences.java")).w("%s not found in base variant --> sticky variant map", str3);
                        } else {
                            hbi hbiVar = new hbi(hbjVar, str4, 0);
                            Iterator<E> it2 = p.iterator();
                            jdg.u(it2);
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (hbiVar.a(next)) {
                                        lfbVar = lfb.g(next);
                                    }
                                } else {
                                    lfbVar = ldu.a;
                                }
                            }
                            if (!lfbVar.e()) {
                                ((ltd) ((ltd) hbj.a.d()).k("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 192, "StickyVariantsPreferences.java")).G("%s missing in variant map, discarding sticky preference for old base variant %s", str4, str3);
                            } else {
                                hbjVar.c.put((String) lfbVar.a(), str4);
                            }
                            hbjVar.c.remove(str3);
                        }
                    }
                    ((hat) hbjVar.d).a(hbjVar.a());
                }
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj7 = this.a;
                lug lugVar = hdq.a;
                Context context = (Context) obj7;
                Resources resources = context.getResources();
                lls h3 = llw.h();
                List<Integer> d2 = hdq.d(context, hdq.b);
                lfy c = lfy.c(',');
                for (Integer num : d2) {
                    int intValue2 = num.intValue();
                    llk e5 = llp.e();
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(resources.openRawResource(intValue2), StandardCharsets.UTF_8);
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                List k3 = c.k(readLine2);
                                if (k3.size() == 1) {
                                    e5.h(hds.a((String) k3.get(0), llp.q()));
                                } else if (k3.size() >= 2) {
                                    e5.h(hds.a((String) k3.get(0), llp.o(k3.subList(1, k3.size()))));
                                }
                            } else {
                                bufferedReader2.close();
                                inputStreamReader.close();
                                h3.a(Integer.valueOf(intValue2), e5.g());
                            }
                        }
                    } catch (IOException e6) {
                        ((luc) ((luc) ((luc) hdq.a.c()).i(e6)).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiSetSupplier", "getDefaultEmojiVariantList", (char) 222, "EmojiSetSupplier.java")).t("Reading emoji list failed.");
                        return lrq.b;
                    }
                }
                return h3.l();
            case 15:
                Object obj8 = this.a;
                lls h4 = llw.h();
                lsz it3 = ((llw) obj8).entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Object b3 = hji.b((Future) entry.getValue());
                    if (b3 != null) {
                        h4.a(entry.getKey(), b3);
                    }
                }
                return h4.l();
            case 16:
                return this.a.W();
            case 17:
                hrn hrnVar = (hrn) this.a;
                hrx hrxVar = hrnVar.a;
                hrxVar.M = null;
                hrxVar.L = jav.G();
                hrnVar.a.S();
                return null;
            case 18:
                hzq hzqVar = (hzq) this.a;
                ZipInputStream zipInputStream = new ZipInputStream(hzqVar.a);
                while (zipInputStream.available() > 0 && (nextEntry = zipInputStream.getNextEntry()) != null) {
                    if (TextUtils.equals(hzqVar.b, kez.h(nextEntry))) {
                        jhs jhsVar = (jhs) nfm.x(jhs.h, zipInputStream, nfb.b());
                        zipInputStream.close();
                        hzqVar.a.close();
                        return jhsVar;
                    }
                }
                zipInputStream.close();
                hzqVar.a.close();
                return jhs.h;
            case 19:
                Object obj9 = this.a;
                ((ltd) ((ltd) ifn.a.b()).k("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker", "lambda$trackHealthMetrics$0", 466, "TypingMetricsTracker.java")).t("Track health metrics in background.");
                new iff(((ifn) obj9).x, ieh.j()).a(true);
                return null;
            default:
                return this.a.a();
        }
    }
}
