package defpackage;

import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: erk  reason: default package */
/* loaded from: classes.dex */
public final class erk implements AutoCloseable {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageMetadataJsonParser");
    private final JsonReader b;

    public erk(Reader reader) {
        this.b = new JsonReader(reader);
    }

    private final List b() {
        ArrayList arrayList = new ArrayList();
        this.b.beginArray();
        while (this.b.hasNext()) {
            arrayList.add(this.b.nextString());
        }
        this.b.endArray();
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final eve a() {
        char c;
        char c2;
        char c3;
        evc evcVar;
        char c4;
        try {
            nfh t = eve.k.t();
            this.b.beginObject();
            while (this.b.hasNext()) {
                String nextName = this.b.nextName();
                switch (nextName.hashCode()) {
                    case -1901989472:
                        if (nextName.equals("lock_key_border")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1677405040:
                        if (nextName.equals("format_version")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -778749547:
                        if (nextName.equals("flavors")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -133417596:
                        if (nextName.equals("localized_names")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -117607525:
                        if (nextName.equals("prefer_key_border")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (nextName.equals("name")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 576741835:
                        if (nextName.equals("is_light_theme")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1466996034:
                        if (nextName.equals("style_sheets")) {
                            c = 1;
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
                        try {
                            int nextInt = this.b.nextInt();
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            eve eveVar = (eve) t.b;
                            eveVar.a |= 1;
                            eveVar.b = nextInt;
                            break;
                        } catch (NumberFormatException e) {
                            throw new IllegalStateException("Expected number, but actually not.", e);
                        }
                    case 1:
                        List b = b();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar2 = (eve) t.b;
                        eveVar2.b();
                        ndt.cs(b, eveVar2.c);
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        this.b.beginArray();
                        while (this.b.hasNext()) {
                            nfh t2 = evd.d.t();
                            this.b.beginObject();
                            while (this.b.hasNext()) {
                                String nextName2 = this.b.nextName();
                                int hashCode = nextName2.hashCode();
                                if (hashCode != 3575610) {
                                    if (hashCode == 1466996034 && nextName2.equals("style_sheets")) {
                                        c2 = 1;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (nextName2.equals("type")) {
                                        c2 = 0;
                                    }
                                    c2 = 65535;
                                }
                                if (c2 == 0) {
                                    String nextString = this.b.nextString();
                                    if (TextUtils.isEmpty(nextString)) {
                                        evcVar = evc.INVALID;
                                    } else {
                                        String upperCase = nextString.toUpperCase(Locale.US);
                                        switch (upperCase.hashCode()) {
                                            case -1692119307:
                                                if (upperCase.equals("XXHDPI")) {
                                                    c3 = '\t';
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case -1106368292:
                                                if (upperCase.equals("SW400DP")) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case -1104521250:
                                                if (upperCase.equals("SW600DP")) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case -1103411295:
                                                if (upperCase.equals("SW768DP")) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case -901206707:
                                                if (upperCase.equals("XXXHDPI")) {
                                                    c3 = '\n';
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case -77725029:
                                                if (upperCase.equals("LANDSCAPE")) {
                                                    c3 = 4;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 2212853:
                                                if (upperCase.equals("HDPI")) {
                                                    c3 = 7;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 2332017:
                                                if (upperCase.equals("LDPI")) {
                                                    c3 = 5;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 2361808:
                                                if (upperCase.equals("MDPI")) {
                                                    c3 = 6;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 83482701:
                                                if (upperCase.equals("XHDPI")) {
                                                    c3 = '\b';
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 1964992556:
                                                if (upperCase.equals("BORDER")) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            default:
                                                c3 = 65535;
                                                break;
                                        }
                                        switch (c3) {
                                            case 0:
                                                evcVar = evc.BORDER;
                                                break;
                                            case 1:
                                                evcVar = evc.SW400DP;
                                                break;
                                            case 2:
                                                evcVar = evc.SW600DP;
                                                break;
                                            case 3:
                                                evcVar = evc.SW768DP;
                                                break;
                                            case 4:
                                                evcVar = evc.LANDSCAPE;
                                                break;
                                            case 5:
                                                evcVar = evc.LDPI;
                                                break;
                                            case 6:
                                                evcVar = evc.MDPI;
                                                break;
                                            case 7:
                                                evcVar = evc.HDPI;
                                                break;
                                            case '\b':
                                                evcVar = evc.XHDPI;
                                                break;
                                            case '\t':
                                                evcVar = evc.XXHDPI;
                                                break;
                                            case '\n':
                                                evcVar = evc.XXXHDPI;
                                                break;
                                            default:
                                                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageMetadataJsonParser", "parseFlavorType", 187, "ThemePackageMetadataJsonParser.java")).w("Unknown flavor type: %s", nextString);
                                                evcVar = evc.INVALID;
                                                break;
                                        }
                                    }
                                    if (t2.c) {
                                        t2.cD();
                                        t2.c = false;
                                    }
                                    evd evdVar = (evd) t2.b;
                                    evdVar.b = evcVar.o;
                                    evdVar.a |= 1;
                                } else if (c2 == 1) {
                                    List b2 = b();
                                    if (t2.c) {
                                        t2.cD();
                                        t2.c = false;
                                    }
                                    evd evdVar2 = (evd) t2.b;
                                    nga ngaVar = evdVar2.c;
                                    if (!ngaVar.c()) {
                                        evdVar2.c = nfm.H(ngaVar);
                                    }
                                    ndt.cs(b2, evdVar2.c);
                                } else {
                                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageMetadataJsonParser", "parseFlavor", 149, "ThemePackageMetadataJsonParser.java")).w("Unexpected field: %s", nextName2);
                                    this.b.skipValue();
                                }
                            }
                            this.b.endObject();
                            arrayList.add((evd) t2.cz());
                        }
                        this.b.endArray();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar3 = (eve) t.b;
                        nga ngaVar2 = eveVar3.d;
                        if (!ngaVar2.c()) {
                            eveVar3.d = nfm.H(ngaVar2);
                        }
                        ndt.cs(arrayList, eveVar3.d);
                        break;
                    case 3:
                        String nextString2 = this.b.nextString();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar4 = (eve) t.b;
                        nextString2.getClass();
                        eveVar4.a |= 2;
                        eveVar4.e = nextString2;
                        break;
                    case 4:
                        ArrayList arrayList2 = new ArrayList();
                        this.b.beginArray();
                        while (this.b.hasNext()) {
                            nfh t3 = evb.d.t();
                            this.b.beginObject();
                            while (this.b.hasNext()) {
                                String nextName3 = this.b.nextName();
                                int hashCode2 = nextName3.hashCode();
                                if (hashCode2 != -1097462182) {
                                    if (hashCode2 == 111972721 && nextName3.equals("value")) {
                                        c4 = 1;
                                    }
                                    c4 = 65535;
                                } else {
                                    if (nextName3.equals("locale")) {
                                        c4 = 0;
                                    }
                                    c4 = 65535;
                                }
                                if (c4 == 0) {
                                    String nextString3 = this.b.nextString();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    evb evbVar = (evb) t3.b;
                                    nextString3.getClass();
                                    evbVar.a |= 2;
                                    evbVar.c = nextString3;
                                } else if (c4 == 1) {
                                    String nextString4 = this.b.nextString();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    evb evbVar2 = (evb) t3.b;
                                    nextString4.getClass();
                                    evbVar2.a |= 1;
                                    evbVar2.b = nextString4;
                                } else {
                                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageMetadataJsonParser", "parseLocalizedString", 216, "ThemePackageMetadataJsonParser.java")).w("Unexpected field: %s", nextName3);
                                    this.b.skipValue();
                                }
                            }
                            this.b.endObject();
                            arrayList2.add((evb) t3.cz());
                        }
                        this.b.endArray();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar5 = (eve) t.b;
                        nga ngaVar3 = eveVar5.f;
                        if (!ngaVar3.c()) {
                            eveVar5.f = nfm.H(ngaVar3);
                        }
                        ndt.cs(arrayList2, eveVar5.f);
                        break;
                    case 5:
                        boolean nextBoolean = this.b.nextBoolean();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar6 = (eve) t.b;
                        eveVar6.a |= 4;
                        eveVar6.g = nextBoolean;
                        break;
                    case 6:
                        boolean nextBoolean2 = this.b.nextBoolean();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar7 = (eve) t.b;
                        eveVar7.a |= 32;
                        eveVar7.j = nextBoolean2;
                        break;
                    case 7:
                        String nextString5 = this.b.nextString();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar8 = (eve) t.b;
                        nextString5.getClass();
                        eveVar8.a |= 8;
                        eveVar8.h = nextString5;
                        break;
                    case '\b':
                        boolean nextBoolean3 = this.b.nextBoolean();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        eve eveVar9 = (eve) t.b;
                        eveVar9.a |= 16;
                        eveVar9.i = nextBoolean3;
                        break;
                    default:
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageMetadataJsonParser", "parseMetadata", 110, "ThemePackageMetadataJsonParser.java")).w("Unexpected field: %s", nextName);
                        this.b.skipValue();
                        break;
                }
            }
            this.b.endObject();
            return (eve) t.cz();
        } catch (IOException | AssertionError | IllegalStateException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageMetadataJsonParser", "parseMetadata", 'x', "ThemePackageMetadataJsonParser.java")).t("Error parsing metadata json file.");
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        gvt.a(this.b);
    }
}
