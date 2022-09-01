package defpackage;

import android.text.TextUtils;
import android.util.JsonReader;
import j$.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: czn  reason: default package */
/* loaded from: classes.dex */
public final class czn {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils");
    private static final lfy d = lfy.c(';').b().h();
    public static final lex a = lex.c(' ');
    public static final lex b = lex.c('_');

    public static czo a(File file, File file2, File file3) {
        if (file.isDirectory() || !file.canRead()) {
            throw new lgj("Cannot read metadata file: ".concat(String.valueOf(file.getPath())));
        }
        if (file.length() == 0) {
            throw new lgj("Metadata file is empty");
        }
        lls h = llw.h();
        lmx g = lmz.g();
        lna g2 = lnd.g();
        lna g3 = lnd.g();
        try {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file)));
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                Map h2 = h(jsonReader);
                Object obj = h2.get("file-name");
                if (obj instanceof String) {
                    String str = (String) obj;
                    lfb e = e(h2);
                    if (e.e()) {
                        if (((czl) e.a()).a) {
                            g.d(str);
                        }
                        h.a(str, (czl) e.a());
                        c(str, g2, ((czl) e.a()).b);
                        c(str, g3, ((czl) e.a()).c);
                    }
                }
            }
            jsonReader.endArray();
            emv b2 = czo.b();
            b2.f = file2;
            b2.c = file3;
            b2.d = h.l();
            b2.f(g.g());
            b2.e(g2.f());
            b2.g(g3.f());
            czo c2 = b2.c();
            jsonReader.close();
            return c2;
        } catch (IOException unused) {
            throw new lgj("Failed to parse metadata.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.util.Map] */
    public static lfb b(File file) {
        if (((Boolean) czu.e.c()).booleanValue()) {
            HashMap hashMap = new HashMap();
            if (file.isDirectory() || !file.canRead()) {
                ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils", "getDynamicArtInfoMapFromJsonFile", 186, "DynamicArtAnimationUtils.java")).w("Cannot read from %s", file.getPath());
            } else if (file.length() != 0) {
                try {
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file)));
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("metadata")) {
                            jsonReader.beginObject();
                            while (true) {
                                if (jsonReader.hasNext()) {
                                    if (!"customProps".equals(jsonReader.nextName())) {
                                        jsonReader.skipValue();
                                    } else {
                                        hashMap = h(jsonReader);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            jsonReader.endObject();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                } catch (IOException e) {
                    ((ltd) ((ltd) ((ltd) c.d()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils", "getDynamicArtInfoMapFromJsonFile", (char) 216, "DynamicArtAnimationUtils.java")).t("Error loading json string");
                }
            }
            return e(hashMap);
        }
        ltg ltgVar = jan.a;
        byte[] n = jan.n(file);
        if (n == null || n.length == 0) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils", "jsonObjectToParseDynamicArtInfo", 69, "DynamicArtAnimationUtils.java")).w("Failed to read JSON file bytes for %s", file.getName());
            return ldu.a;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(n, StandardCharsets.UTF_8)).getJSONObject("metadata").getJSONObject("customProps");
            int optInt = jSONObject.optInt("max-lines", -1);
            if (optInt == -1) {
                optInt = jSONObject.getInt("required-lines");
            }
            String string = jSONObject.getString("alt-text");
            llk e2 = llp.e();
            for (int i = 0; i < optInt; i++) {
                String str = "line" + i;
                int i2 = jSONObject.getInt(str + "-char-min");
                int i3 = jSONObject.getInt(str + "-char-max");
                int i4 = jSONObject.getInt(str + "-font-min");
                int i5 = jSONObject.getInt(str + "-font-max");
                czp a2 = czq.a();
                a2.a = "_txt_" + i;
                a2.c(i2);
                a2.b(i3);
                a2.e(i4);
                a2.d(i5);
                e2.h(a2.a());
            }
            return d(jSONObject.getString("concept-map"), jSONObject.getString("keyword-map"), optInt, string, e2);
        } catch (JSONException e3) {
            ((ltd) ((ltd) ((ltd) c.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils", "jsonObjectToParseDynamicArtInfo", 111, "DynamicArtAnimationUtils.java")).w("Invalid JSON for %s", file.getName());
            return ldu.a;
        }
    }

    public static void c(String str, lna lnaVar, llp llpVar) {
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            lnaVar.g((String) llpVar.get(i2), str);
        }
    }

    private static lfb d(String str, String str2, int i, String str3, llk llkVar) {
        llp llpVar;
        llp llpVar2;
        String str4;
        llp llpVar3;
        lfy lfyVar = d;
        List<String> k = lfyVar.k(str);
        List<String> k2 = lfyVar.k(str2);
        llk e = llp.e();
        llk e2 = llp.e();
        boolean z = false;
        boolean z2 = false;
        for (String str5 : k) {
            if (TextUtils.equals("*", str5.trim())) {
                z2 = true;
            } else {
                e.h(str5);
            }
        }
        boolean z3 = false;
        for (String str6 : k2) {
            if (TextUtils.equals("*", str6.trim())) {
                z3 = true;
            } else {
                e2.h(str6);
            }
        }
        czk czkVar = new czk();
        czkVar.a(false);
        czkVar.a = i;
        czkVar.g = (byte) (czkVar.g | 1);
        if (z3 || z2) {
            z = true;
        }
        czkVar.a(z);
        if (str3 != null) {
            czkVar.e = str3;
            llp g = llkVar.g();
            if (g != null) {
                czkVar.f = g;
                llp g2 = e.g();
                if (g2 != null) {
                    czkVar.c = g2;
                    llp g3 = e2.g();
                    if (g3 != null) {
                        czkVar.d = g3;
                        if (czkVar.g != 3 || (llpVar = czkVar.c) == null || (llpVar2 = czkVar.d) == null || (str4 = czkVar.e) == null || (llpVar3 = czkVar.f) == null) {
                            StringBuilder sb = new StringBuilder();
                            if ((czkVar.g & 1) == 0) {
                                sb.append(" maxLines");
                            }
                            if ((czkVar.g & 2) == 0) {
                                sb.append(" isGeneric");
                            }
                            if (czkVar.c == null) {
                                sb.append(" concepts");
                            }
                            if (czkVar.d == null) {
                                sb.append(" keywords");
                            }
                            if (czkVar.e == null) {
                                sb.append(" altText");
                            }
                            if (czkVar.f == null) {
                                sb.append(" linesInfo");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        return lfb.g(new czl(czkVar.a, czkVar.b, llpVar, llpVar2, str4, llpVar3));
                    }
                    throw new NullPointerException("Null keywords");
                }
                throw new NullPointerException("Null concepts");
            }
            throw new NullPointerException("Null linesInfo");
        }
        throw new NullPointerException("Null altText");
    }

    private static lfb e(Map map) {
        if (map.isEmpty()) {
            return ldu.a;
        }
        Integer f = f(map, "max-lines");
        if (f == null) {
            f = f(map, "required-lines");
        }
        if (f == null) {
            return ldu.a;
        }
        llk e = llp.e();
        for (int i = 0; i < f.intValue(); i++) {
            String str = "line" + i;
            Integer f2 = f(map, str.concat("-char-min"));
            Integer f3 = f(map, str.concat("-char-max"));
            Integer f4 = f(map, str.concat("-font-min"));
            Integer f5 = f(map, str.concat("-font-max"));
            if (f3 == null || f2 == null || f5 == null || f4 == null) {
                return ldu.a;
            }
            czp a2 = czq.a();
            a2.a = "_txt_" + i;
            a2.c(f2.intValue());
            a2.b(f3.intValue());
            a2.e(f4.intValue());
            a2.d(f5.intValue());
            e.h(a2.a());
        }
        String g = g(map, "alt-text");
        String g2 = g(map, "concept-map");
        String g3 = g(map, "keyword-map");
        if (g == null || g2 == null || g3 == null) {
            return ldu.a;
        }
        return d(g2, g3, f.intValue(), g, e);
    }

    private static Integer f(Map map, Object obj) {
        Long g;
        Object obj2 = map.get(obj);
        if (obj2 instanceof Integer) {
            return (Integer) obj2;
        }
        if ((obj2 instanceof String) && (g = mhq.g((String) obj2)) != null && g.longValue() == g.intValue()) {
            return Integer.valueOf(g.intValue());
        }
        return null;
    }

    private static String g(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    private static Map h(JsonReader jsonReader) {
        HashMap hashMap = new HashMap();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int i = czm.a[jsonReader.peek().ordinal()];
                if (i == 1) {
                    hashMap.put(nextName, jsonReader.nextString());
                } else if (i == 2) {
                    hashMap.put(nextName, Integer.valueOf(jsonReader.nextInt()));
                } else {
                    ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils", "getNextMap", 172, "DynamicArtAnimationUtils.java")).t("Not supported token");
                }
            }
            jsonReader.endObject();
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) c.d()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationUtils", "getNextMap", (char) 177, "DynamicArtAnimationUtils.java")).t("Failed to get next map");
        }
        return hashMap;
    }
}
