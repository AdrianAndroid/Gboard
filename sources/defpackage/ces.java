package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ces  reason: default package */
/* loaded from: classes.dex */
public final class ces implements jqa {
    private final Context c;
    private final idk d;
    private static final lug b = lug.i("SuperDelight");
    public static final Pattern a = Pattern.compile("(.+)_d3_(\\d{8,10}).dict");

    public ces(Context context, idk idkVar) {
        this.c = context.getApplicationContext();
        this.d = idkVar;
    }

    private final void c(jtr jtrVar, Map map, Set set, int i, List list) {
        for (Map.Entry entry : map.entrySet()) {
            Locale locale = (Locale) entry.getKey();
            if (set.contains(locale)) {
                b(jtrVar, i, cbw.c(mvl.MAIN, (File) entry.getValue(), locale), locale, list);
            }
        }
    }

    public final void b(jtr jtrVar, int i, mvm mvmVar, Locale locale, List list) {
        long lmContentVersion;
        if (mvmVar != null && new File(mvmVar.d).exists()) {
            long j = mvmVar.j;
            if (j > 0) {
                lmContentVersion = j;
            } else {
                cbz cbzVar = Delight5Facilitator.h(this.c).h.e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                mvn b2 = cbzVar.b(mvmVar);
                cbzVar.d(mti.GET_LM_CONTENT_VERSION);
                lmContentVersion = cbzVar.a.getLmContentVersion(b2);
                cbzVar.e(mti.GET_LM_CONTENT_VERSION);
                cbzVar.b.g(caq.DELIGHT_GET_LM_CONTENT_VERSION, SystemClock.elapsedRealtime() - elapsedRealtime);
                cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(b2.c));
            }
            if (lmContentVersion < 1) {
                return;
            }
            StringBuilder sb = new StringBuilder("main");
            jub p = juc.p();
            p.m("bundled_delight");
            p.a = jtrVar;
            p.n(mvmVar.f);
            p.o(false);
            if (i == 2 || i == 3) {
                p.c = "fst-decompress";
            }
            if (!TextUtils.isEmpty(locale.getLanguage())) {
                p.e("language", locale.getLanguage().toLowerCase(Locale.US));
                sb.append("_");
                sb.append(locale.getLanguage().toLowerCase(Locale.US));
            }
            if (!TextUtils.isEmpty(locale.getCountry())) {
                p.e("country", locale.getCountry().toLowerCase(Locale.US));
                sb.append("_");
                sb.append(locale.getCountry().toLowerCase(Locale.US));
            }
            p.e("version", Long.valueOf(lmContentVersion));
            sb.append("_");
            sb.append(lmContentVersion);
            sb.append("_");
            sb.append(i);
            p.e("status", Integer.valueOf(i));
            p.l(sb.toString());
            list.add(p.a());
        }
    }

    @Override // defpackage.jsj
    public final String d() {
        return "SuperDelightBundledMetadataParser";
    }

    @Override // defpackage.jqa
    public final jqm w(InputStream inputStream, String str, int i) {
        HashSet hashSet;
        jql f = jqm.f();
        f.d(str);
        f.e(i);
        final jtr c = jtr.c(str, i);
        final ArrayList arrayList = new ArrayList();
        for (Locale locale : cbd.c.j().keySet()) {
            b(c, 2, cbw.b(this.c, locale), locale, arrayList);
        }
        File file = new File(cbd.c.i(this.c));
        if (!file.isDirectory() || !file.canRead()) {
            ((luc) ((luc) b.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledMetadataParser", "addSystemLms", 199, "SuperDelightBundledMetadataParser.java")).w("system lm dir %s does not exist or is not readable", file);
        } else {
            file.listFiles(new FilenameFilter() { // from class: cer
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    ces cesVar = ces.this;
                    jtr jtrVar = c;
                    List list = arrayList;
                    Matcher matcher = ces.a.matcher(str2);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Locale forLanguageTag = Locale.forLanguageTag(group.replace('_', '-'));
                        int parseInt = Integer.parseInt(group2);
                        mvm c2 = cbw.c(mvl.MAIN, file2, forLanguageTag);
                        nfh nfhVar = (nfh) c2.N(5);
                        nfhVar.cG(c2);
                        long j = parseInt;
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        mvm mvmVar = (mvm) nfhVar.b;
                        mvm mvmVar2 = mvm.l;
                        mvmVar.a |= 256;
                        mvmVar.j = j;
                        cesVar.b(jtrVar, 3, (mvm) nfhVar.cz(), forLanguageTag, list);
                    }
                    return false;
                }
            });
        }
        String obj = cbd.a(this.c).toString();
        String str2 = File.separator;
        File file2 = new File(obj + str2 + "staging");
        HashMap hashMap = new HashMap();
        file2.listFiles(new cbb(hashMap, 2));
        String obj2 = cbd.a(this.c).toString();
        String str3 = File.separator;
        File file3 = new File(obj2 + str3 + "cache");
        HashMap hashMap2 = new HashMap();
        file3.listFiles(new cbb(hashMap2, 0));
        if (!hashMap.isEmpty() || !hashMap2.isEmpty()) {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
            jsonReader.setLenient(true);
            jsonReader.beginObject();
            while (true) {
                if (!jsonReader.hasNext()) {
                    hashSet = null;
                    break;
                } else if (!"metadataEntries".equals(jsonReader.nextName())) {
                    jsonReader.skipValue();
                } else {
                    HashSet hashSet2 = new HashSet();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        Locale locale2 = null;
                        while (jsonReader.hasNext()) {
                            if ("locale".equals(jsonReader.nextName())) {
                                locale2 = jay.f(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        if (locale2 != null) {
                            hashSet2.add(locale2);
                        } else {
                            ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledMetadataParser", "parseSupportedLocales", 97, "SuperDelightBundledMetadataParser.java")).t("SuperDelightBundledMetadataParser#parseSupportedLocales(): locale not found");
                        }
                    }
                    jsonReader.endArray();
                    hashSet = hashSet2;
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            if (hashSet == null || hashSet.isEmpty()) {
                ((luc) ((luc) b.d()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledMetadataParser", "parse", 158, "SuperDelightBundledMetadataParser.java")).t("SuperDelightBundledMetadataParser#parse(): unable to parse locales from metadata.json");
            } else {
                HashSet hashSet3 = hashSet;
                c(c, hashMap, hashSet3, 4, arrayList);
                c(c, hashMap2, hashSet3, 5, arrayList);
            }
        }
        HashSet hashSet4 = new HashSet();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            juc jucVar = (juc) arrayList.get(i2);
            String i3 = jucVar.i();
            if (hashSet4.contains(jucVar.i())) {
                ((luc) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledMetadataParser", "parse", 174, "SuperDelightBundledMetadataParser.java")).w("SuperDelightBundledMetadataParser#addLocalPacks(): attempting to add duplicate pack with name %s", i3);
            } else {
                f.b(jucVar);
                hashSet4.add(i3);
            }
        }
        jqm a2 = f.a();
        int size2 = a2.j().size();
        this.d.e(cap.SUPER_DELIGHT_BUNDLED_PACKS_FOUND, Integer.valueOf(size2));
        ((luc) ((luc) b.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledMetadataParser", "parse", 189, "SuperDelightBundledMetadataParser.java")).u("SuperDelightBundledMetadataParser#parse(): manifest parsed with %d packs", size2);
        return a2;
    }
}
