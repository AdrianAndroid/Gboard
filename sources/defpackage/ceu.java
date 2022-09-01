package defpackage;

import android.text.TextUtils;
import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ceu  reason: default package */
/* loaded from: classes.dex */
public class ceu implements jqa {
    private static final lug a = lug.i("SuperDelight");

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(jub jubVar, String str, String str2, StringBuilder sb) {
        char c;
        String[] split;
        switch (str.hashCode()) {
            case -2089109362:
                if (str.equals("originalFileSize")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1097462182:
                if (str.equals("locale")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -734611587:
                if (str.equals("filesize")) {
                    c = 2;
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
            case 351608024:
                if (str.equals("version")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 546767118:
                if (str.equals("launch_tag")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1680750052:
                if (str.equals("md5_checksum")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (str2.contains("-")) {
                    split = str2.split("-");
                } else {
                    split = str2.split("_");
                }
                int length = split.length;
                if (length <= 0) {
                    return;
                }
                if (!TextUtils.isEmpty(split[0])) {
                    jubVar.e("language", split[0].toLowerCase(Locale.US));
                    sb.append("_");
                    sb.append(split[0].toLowerCase(Locale.US));
                }
                if (length <= 1 || TextUtils.isEmpty(split[1])) {
                    return;
                }
                jubVar.e("country", split[1].toLowerCase(Locale.US));
                sb.append("_");
                sb.append(split[1].toLowerCase(Locale.US));
                return;
            case 1:
                jubVar.d(str2);
                return;
            case 2:
                jubVar.h(Long.parseLong(str2));
                return;
            case 3:
                jubVar.n(Long.parseLong(str2));
                return;
            case 4:
                jubVar.e("version", Long.valueOf(Long.parseLong(str2)));
                sb.append("_");
                sb.append(str2);
                return;
            case 5:
                jubVar.f("md5");
                jubVar.e("md5_checksum", str2);
                return;
            case 6:
                jubVar.e("launch_tag", str2);
                sb.append("_");
                sb.append(str2);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jsj
    public final String d() {
        return "SuperDelightDownloadMetadataParser";
    }

    @Override // defpackage.jqa
    public final jqm w(InputStream inputStream, String str, int i) {
        try {
            jql f = jqm.f();
            f.d(str);
            f.e(i);
            jtr c = jtr.c(str, i);
            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
            jsonReader.setLenient(true);
            jsonReader.beginObject();
            while (true) {
                if (!jsonReader.hasNext()) {
                    break;
                } else if (!"metadataEntries".equals(jsonReader.nextName())) {
                    jsonReader.skipValue();
                } else {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jub p = juc.p();
                        p.m(((jrn) c).a);
                        p.c = "fst-decompress";
                        p.a = c;
                        p.o(true);
                        jsonReader.beginObject();
                        StringBuilder sb = new StringBuilder("main");
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if (!TextUtils.isEmpty(nextName)) {
                                a(p, nextName, jsonReader.nextString(), sb);
                            }
                        }
                        sb.append("_1");
                        p.e("status", 1);
                        p.l(sb.toString());
                        jsonReader.endObject();
                        juc a2 = p.a();
                        if (cei.g(a2) == null) {
                            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightDownloadMetadataParser", "parsePackEntries", 80, "SuperDelightDownloadMetadataParser.java")).w("SuperDelightDownloadMetadataParser#parsePackEntries(): Locale not found %s", a2);
                        } else {
                            f.b(a2);
                        }
                    }
                    jsonReader.endArray();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            jqm a3 = f.a();
            ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightDownloadMetadataParser", "parse", 185, "SuperDelightDownloadMetadataParser.java")).E("SuperDelightDownloadMetadataParser#parse(%s): Manifest parsed with %d packs", str, a3.j().size());
            return a3;
        } catch (Exception e) {
            ieh.j().e(cap.DELIGHT_METADATA_PARSE_FAILED, new Object[0]);
            throw new jpz("error parsing delight metadata", e);
        }
    }
}
