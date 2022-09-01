package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: htq  reason: default package */
/* loaded from: classes.dex */
public final class htq {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils");
    private static final String b = String.class.getSimpleName();
    private static final String c = Integer.class.getSimpleName();

    public static llp a(String str) {
        char c2;
        llk e = llp.e();
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals(c)) {
                        e.h(Integer.valueOf(jsonReader.nextInt()));
                    } else if (nextName.equals(b)) {
                        e.h(jsonReader.nextString());
                    } else if (nextName.equals("KeyData::keycode")) {
                        e.h(c(jsonReader, jsonReader.nextInt()));
                    } else if (nextName.equals("KeyHistory")) {
                        jsonReader.beginObject();
                        hui huiVar = null;
                        ial[] ialVarArr = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("actionDefs")) {
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    iaj iajVar = new iaj();
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String nextName3 = jsonReader.nextName();
                                        int hashCode = nextName3.hashCode();
                                        if (hashCode == -1422950858) {
                                            if (nextName3.equals("action")) {
                                                c2 = 0;
                                            }
                                            c2 = 65535;
                                        } else if (hashCode != 330271691) {
                                            if (hashCode == 475634410 && nextName3.equals("keyDatas")) {
                                                c2 = 2;
                                            }
                                            c2 = 65535;
                                        } else {
                                            if (nextName3.equals("popupLabels")) {
                                                c2 = 1;
                                            }
                                            c2 = 65535;
                                        }
                                        if (c2 == 0) {
                                            try {
                                                iajVar.b = iah.a(jsonReader.nextString());
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        } else if (c2 == 1) {
                                            ArrayList arrayList2 = new ArrayList();
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                arrayList2.add(d(jsonReader));
                                            }
                                            jsonReader.endArray();
                                            iajVar.d = (String[]) arrayList2.toArray(gvw.g);
                                        } else if (c2 == 2) {
                                            ArrayList arrayList3 = new ArrayList();
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                jsonReader.beginObject();
                                                iay c3 = c(jsonReader, 0);
                                                jsonReader.endObject();
                                                arrayList3.add(c3);
                                            }
                                            jsonReader.endArray();
                                            iajVar.c = (iay[]) arrayList3.toArray(iay.b);
                                        } else {
                                            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "readActionDefObject", 236, "JsonUtils.java")).w("Invalid name: %s", nextName3);
                                            jsonReader.skipValue();
                                        }
                                    }
                                    jsonReader.endObject();
                                    ial b2 = iajVar.b();
                                    if (b2 != null) {
                                        arrayList.add(b2);
                                    }
                                }
                                jsonReader.endArray();
                                ialVarArr = (ial[]) arrayList.toArray(new ial[arrayList.size()]);
                            } else {
                                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "readKeyHistoryObject", 136, "JsonUtils.java")).w("Unexpected field name: %s", nextName2);
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        if (ialVarArr == null) {
                            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "readKeyHistoryObject", 142, "JsonUtils.java")).t("keyData and/or actionDefs is null");
                        } else {
                            huiVar = new hui(ialVarArr);
                        }
                        if (huiVar != null) {
                            e.h(huiVar);
                        }
                    } else {
                        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "jsonStrToList", 113, "JsonUtils.java")).w("Invalid name: %s", nextName);
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
            llp g = e.g();
            jsonReader.close();
            return g;
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "jsonStrToList", 'z', "JsonUtils.java")).t("Error loading json string");
            return llp.q();
        }
    }

    public static String b(Iterator it) {
        if (!it.hasNext()) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginArray();
            while (it.hasNext()) {
                Object next = it.next();
                jsonWriter.beginObject();
                if (next instanceof Integer) {
                    jsonWriter.name(c).value((Integer) next);
                } else if (next instanceof String) {
                    jsonWriter.name(b).value((String) next);
                } else if (next instanceof iay) {
                    iay iayVar = (iay) next;
                    jsonWriter.name("KeyData::keycode").value(iayVar.c);
                    if (iayVar.d != null) {
                        jsonWriter.name("KeyData::intention").value(iayVar.d.toString());
                    }
                    if (iayVar.e != null) {
                        jsonWriter.name("KeyData::data").value((String) iayVar.e);
                    }
                } else if (next instanceof hui) {
                    jsonWriter.name("KeyHistory");
                    jsonWriter.beginObject();
                    jsonWriter.name("actionDefs");
                    ial[] ialVarArr = ((hui) next).b;
                    jsonWriter.beginArray();
                    int length = ialVarArr.length;
                    int i = 0;
                    while (i < length) {
                        ial ialVar = ialVarArr[i];
                        jsonWriter.beginObject();
                        jsonWriter.name("action").value(ialVar.c.toString());
                        jsonWriter.name("popupLabels");
                        String[] strArr = ialVar.m;
                        jsonWriter.beginArray();
                        for (String str : strArr) {
                            jsonWriter.value(str);
                        }
                        jsonWriter.endArray();
                        jsonWriter.name("keyDatas");
                        iay[] iayVarArr = ialVar.d;
                        jsonWriter.beginArray();
                        int length2 = iayVarArr.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            iay iayVar2 = iayVarArr[i2];
                            jsonWriter.beginObject();
                            int i3 = i;
                            jsonWriter.name("KeyData::keycode").value(iayVar2.c);
                            if (iayVar2.d != null) {
                                jsonWriter.name("KeyData::intention").value(iayVar2.d.toString());
                            }
                            if (iayVar2.e != null) {
                                jsonWriter.name("KeyData::data").value((String) iayVar2.e);
                            }
                            jsonWriter.endObject();
                            i2++;
                            i = i3;
                        }
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        i++;
                    }
                    jsonWriter.endArray();
                    jsonWriter.endObject();
                } else {
                    ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "listToJsonStr", 312, "JsonUtils.java")).w("Unsupported object type %s", next.getClass().getSimpleName());
                }
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            String stringWriter2 = stringWriter.toString();
            jsonWriter.close();
            return stringWriter2;
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "listToJsonStr", (char) 319, "JsonUtils.java")).t("Error saving json string");
            return "";
        }
    }

    private static iay c(JsonReader jsonReader, int i) {
        char c2;
        iax iaxVar = null;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -2019242717) {
                if (nextName.equals("KeyData::keycode")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else if (hashCode != -1427400061) {
                if (hashCode == -559948109 && nextName.equals("KeyData::data")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else {
                if (nextName.equals("KeyData::intention")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                i = jsonReader.nextInt();
            } else if (c2 == 1) {
                String d = d(jsonReader);
                if (d != null && !"null".equals(d)) {
                    try {
                        iaxVar = iax.a(d);
                    } catch (IllegalArgumentException unused) {
                        iaxVar = iax.COMMIT;
                    }
                }
            } else if (c2 == 2) {
                str = d(jsonReader);
            } else {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "readKeyDataObjectImpl", 192, "JsonUtils.java")).w("Unexpected name: %s", nextName);
                jsonReader.skipValue();
            }
        }
        return new iay(i, iaxVar, str);
    }

    private static String d(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i = htp.a[peek.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.skipValue();
                return null;
            }
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/JsonUtils", "nextStringOrNull", 275, "JsonUtils.java")).w("Unsupported object type %s", peek);
            jsonReader.skipValue();
            return null;
        }
        return jsonReader.nextString();
    }
}
