package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cd  reason: default package */
/* loaded from: classes.dex */
public class cd {
    public static azp A(Context context, an anVar, boolean z, boolean z2) {
        int fO;
        ak akVar = anVar.R;
        int i = 0;
        int i2 = akVar == null ? 0 : akVar.f;
        if (z2) {
            if (z) {
                fO = anVar.fP();
            } else {
                fO = anVar.fQ();
            }
        } else if (z) {
            fO = anVar.fN();
        } else {
            fO = anVar.fO();
        }
        anVar.Y(0, 0, 0, 0);
        ViewGroup viewGroup = anVar.N;
        if (viewGroup != null && viewGroup.getTag(R.id.f130520_resource_name_obfuscated_res_0x7f0b21ef) != null) {
            anVar.N.setTag(R.id.f130520_resource_name_obfuscated_res_0x7f0b21ef, null);
        }
        ViewGroup viewGroup2 = anVar.N;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (fO != 0) {
                i = fO;
            } else if (i2 != 0) {
                if (i2 == 4097) {
                    i = true != z ? R.animator.f570_resource_name_obfuscated_res_0x7f020018 : R.animator.f560_resource_name_obfuscated_res_0x7f020017;
                } else if (i2 == 8194) {
                    i = true != z ? R.animator.f530_resource_name_obfuscated_res_0x7f020014 : R.animator.f520_resource_name_obfuscated_res_0x7f020013;
                } else if (i2 != 8197) {
                    if (i2 == 4099) {
                        i = true != z ? R.animator.f550_resource_name_obfuscated_res_0x7f020016 : R.animator.f540_resource_name_obfuscated_res_0x7f020015;
                    } else if (i2 != 4100) {
                        i = -1;
                    } else if (z) {
                        i = B(context, 16842936);
                    } else {
                        i = B(context, 16842937);
                    }
                } else if (z) {
                    i = B(context, 16842938);
                } else {
                    i = B(context, 16842939);
                }
            }
            if (i != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation != null) {
                            return new azp(loadAnimation);
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (loadAnimator != null) {
                        return new azp(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                    if (loadAnimation2 != null) {
                        return new azp(loadAnimation2);
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static int B(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Bitmap a(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    public static MediaDescription c(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static Uri d(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static Bundle e(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static CharSequence f(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static CharSequence g(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static CharSequence h(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static String i(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static int r(int i) {
        if (i != 0) {
            if (i == 4) {
                return 4;
            }
            if (i == 8) {
                return 3;
            }
            throw new IllegalArgumentException("Unknown visibility " + i);
        }
        return 2;
    }

    public static int s(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return r(view.getVisibility());
    }

    public static void t(int i, View view) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                return;
            }
            if (bi.S(2)) {
                StringBuilder sb = new StringBuilder("SpecialEffectsController: Removing view ");
                sb.append(view);
                sb.append(" from container ");
                sb.append(viewGroup);
            }
            viewGroup.removeView(view);
        } else if (i2 == 1) {
            if (bi.S(2)) {
                new StringBuilder("SpecialEffectsController: Setting view ").append(view);
            }
            view.setVisibility(0);
        } else if (i2 != 2) {
            if (bi.S(2)) {
                new StringBuilder("SpecialEffectsController: Setting view ").append(view);
            }
            view.setVisibility(4);
        } else {
            if (bi.S(2)) {
                new StringBuilder("SpecialEffectsController: Setting view ").append(view);
            }
            view.setVisibility(8);
        }
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public void v(an anVar) {
    }

    public void w(an anVar) {
    }

    public void x(an anVar) {
    }

    public static niy z(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            nfh c = niy.c();
            c.ee(2);
            return (niy) c.cz();
        } else if (i2 == 1) {
            nfh c2 = niy.c();
            c2.ee(2);
            return (niy) c2.cz();
        } else if (i2 == 2) {
            nfh c3 = niy.c();
            c3.ee(2);
            return (niy) c3.cz();
        } else if (i2 != 3) {
            switch (i2) {
                case 100:
                    nfh c4 = niy.c();
                    c4.ee(3);
                    return (niy) c4.cz();
                case 101:
                    nfh c5 = niy.c();
                    c5.ee(3);
                    return (niy) c5.cz();
                case 102:
                    nfh c6 = niy.c();
                    c6.ee(3);
                    return (niy) c6.cz();
                case 103:
                    nfh c7 = niy.c();
                    c7.ee(3);
                    return (niy) c7.cz();
                case 104:
                    nfh c8 = niy.c();
                    c8.ee(3);
                    return (niy) c8.cz();
                case 105:
                    nfh c9 = niy.c();
                    c9.ee(3);
                    return (niy) c9.cz();
                case 106:
                    nfh c10 = niy.c();
                    c10.ee(3);
                    return (niy) c10.cz();
                case 107:
                    nfh c11 = niy.c();
                    c11.ee(2);
                    return (niy) c11.cz();
                case 108:
                    nfh c12 = niy.c();
                    c12.ee(3);
                    return (niy) c12.cz();
                case 109:
                    nfh c13 = niy.c();
                    c13.ee(3);
                    return (niy) c13.cz();
                case 110:
                    nfh c14 = niy.c();
                    c14.ee(2);
                    return (niy) c14.cz();
                case 111:
                    nfh c15 = niy.c();
                    c15.ee(3);
                    return (niy) c15.cz();
                case 112:
                    nfh c16 = niy.c();
                    c16.ee(3);
                    return (niy) c16.cz();
                case 113:
                    nfh c17 = niy.c();
                    c17.ee(3);
                    return (niy) c17.cz();
                case 114:
                    nfh c18 = niy.c();
                    c18.ee(2);
                    return (niy) c18.cz();
                case 115:
                    nfh c19 = niy.c();
                    c19.ee(3);
                    return (niy) c19.cz();
                case 116:
                    nfh c20 = niy.c();
                    c20.ee(3);
                    return (niy) c20.cz();
                case 117:
                    nfh c21 = niy.c();
                    c21.ee(3);
                    return (niy) c21.cz();
                case 118:
                    nfh c22 = niy.c();
                    c22.ee(3);
                    return (niy) c22.cz();
                case 119:
                    nfh c23 = niy.c();
                    c23.ee(3);
                    return (niy) c23.cz();
                case 120:
                    nfh c24 = niy.c();
                    c24.ee(3);
                    return (niy) c24.cz();
                case 121:
                    nfh c25 = niy.c();
                    c25.ee(3);
                    return (niy) c25.cz();
                case 122:
                    nfh c26 = niy.c();
                    c26.ee(3);
                    return (niy) c26.cz();
                case 123:
                    nfh c27 = niy.c();
                    c27.ee(3);
                    return (niy) c27.cz();
                case 124:
                    nfh c28 = niy.c();
                    c28.ee(3);
                    return (niy) c28.cz();
                case 125:
                    nfh c29 = niy.c();
                    c29.ee(3);
                    return (niy) c29.cz();
                case 126:
                    nfh c30 = niy.c();
                    c30.ee(3);
                    return (niy) c30.cz();
                case 127:
                    nfh c31 = niy.c();
                    c31.ee(3);
                    return (niy) c31.cz();
                case 128:
                    nfh c32 = niy.c();
                    c32.ee(3);
                    return (niy) c32.cz();
                case 129:
                    nfh c33 = niy.c();
                    c33.ee(3);
                    return (niy) c33.cz();
                case 130:
                    nfh c34 = niy.c();
                    c34.ee(3);
                    return (niy) c34.cz();
                case 131:
                    nfh c35 = niy.c();
                    c35.ee(3);
                    return (niy) c35.cz();
                case 132:
                    nfh c36 = niy.c();
                    c36.ee(3);
                    return (niy) c36.cz();
                case 133:
                    nfh c37 = niy.c();
                    c37.ee(3);
                    return (niy) c37.cz();
                case 134:
                    nfh c38 = niy.c();
                    c38.ee(3);
                    return (niy) c38.cz();
                case 135:
                    nfh c39 = niy.c();
                    c39.ee(2);
                    return (niy) c39.cz();
                case 136:
                    nfh c40 = niy.c();
                    c40.ee(2);
                    return (niy) c40.cz();
                case 137:
                    nfh c41 = niy.c();
                    c41.ee(2);
                    return (niy) c41.cz();
                case 138:
                    nfh c42 = niy.c();
                    c42.ee(2);
                    return (niy) c42.cz();
                case 139:
                    nfh c43 = niy.c();
                    c43.ee(2);
                    return (niy) c43.cz();
                case 140:
                    nfh c44 = niy.c();
                    c44.ee(2);
                    return (niy) c44.cz();
                case 141:
                    nfh c45 = niy.c();
                    c45.ee(2);
                    return (niy) c45.cz();
                case 142:
                    nfh c46 = niy.c();
                    c46.ee(2);
                    return (niy) c46.cz();
                case 143:
                    nfh c47 = niy.c();
                    c47.ee(2);
                    return (niy) c47.cz();
                case 144:
                    nfh c48 = niy.c();
                    c48.ee(2);
                    return (niy) c48.cz();
                case 145:
                    nfh c49 = niy.c();
                    c49.ee(2);
                    return (niy) c49.cz();
                case 146:
                    nfh c50 = niy.c();
                    c50.ee(2);
                    return (niy) c50.cz();
                case 147:
                    nfh c51 = niy.c();
                    c51.ee(2);
                    return (niy) c51.cz();
                case 148:
                    nfh c52 = niy.c();
                    c52.ee(2);
                    return (niy) c52.cz();
                case 149:
                    nfh c53 = niy.c();
                    c53.ee(2);
                    return (niy) c53.cz();
                case 150:
                    nfh c54 = niy.c();
                    c54.ee(3);
                    return (niy) c54.cz();
                case 151:
                    nfh c55 = niy.c();
                    c55.ee(3);
                    return (niy) c55.cz();
                case 152:
                    nfh c56 = niy.c();
                    c56.ee(3);
                    return (niy) c56.cz();
                case 153:
                    nfh c57 = niy.c();
                    c57.ee(3);
                    return (niy) c57.cz();
                case 154:
                    nfh c58 = niy.c();
                    c58.ee(3);
                    return (niy) c58.cz();
                case 155:
                    nfh c59 = niy.c();
                    c59.ee(3);
                    return (niy) c59.cz();
                case 156:
                    nfh c60 = niy.c();
                    c60.ee(3);
                    return (niy) c60.cz();
                case 157:
                    nfh c61 = niy.c();
                    c61.ee(23);
                    return (niy) c61.cz();
                case 158:
                    nfh c62 = niy.c();
                    c62.ee(2);
                    return (niy) c62.cz();
                case 159:
                    nfh c63 = niy.c();
                    c63.ee(2);
                    return (niy) c63.cz();
                case 160:
                    nfh c64 = niy.c();
                    c64.ee(2);
                    return (niy) c64.cz();
                case 161:
                    nfh c65 = niy.c();
                    nfh c66 = niw.c();
                    c66.dZ(2);
                    c66.dZ(16);
                    c65.ec((niw) c66.cz());
                    return (niy) c65.cz();
                case 162:
                    nfh c67 = niy.c();
                    nfh c68 = niw.c();
                    c68.dZ(2);
                    c68.dZ(16);
                    c67.ec((niw) c68.cz());
                    return (niy) c67.cz();
                case 163:
                    nfh c69 = niy.c();
                    nfh c70 = niw.c();
                    c70.dZ(2);
                    c70.dZ(16);
                    c69.ec((niw) c70.cz());
                    return (niy) c69.cz();
                case 164:
                    nfh c71 = niy.c();
                    nfh c72 = niw.c();
                    c72.dZ(2);
                    c72.dZ(16);
                    c71.ec((niw) c72.cz());
                    return (niy) c71.cz();
                case 165:
                    nfh c73 = niy.c();
                    c73.ee(2);
                    return (niy) c73.cz();
                case 166:
                    nfh c74 = niy.c();
                    c74.ee(5);
                    return (niy) c74.cz();
                case 167:
                    nfh c75 = niy.c();
                    c75.ee(2);
                    return (niy) c75.cz();
                case 168:
                    nfh c76 = niy.c();
                    c76.ee(21);
                    return (niy) c76.cz();
                case 169:
                    nfh c77 = niy.c();
                    c77.ee(21);
                    return (niy) c77.cz();
                case 170:
                    nfh c78 = niy.c();
                    c78.ee(21);
                    return (niy) c78.cz();
                case 171:
                    nfh c79 = niy.c();
                    c79.ee(21);
                    return (niy) c79.cz();
                case 172:
                    nfh c80 = niy.c();
                    c80.ee(3);
                    return (niy) c80.cz();
                case 173:
                    nfh c81 = niy.c();
                    c81.ee(3);
                    return (niy) c81.cz();
                case 174:
                    nfh c82 = niy.c();
                    c82.ee(3);
                    return (niy) c82.cz();
                case 175:
                    nfh c83 = niy.c();
                    c83.ee(3);
                    return (niy) c83.cz();
                case 176:
                    nfh c84 = niy.c();
                    c84.ee(3);
                    return (niy) c84.cz();
                case 177:
                    nfh c85 = niy.c();
                    c85.ee(15);
                    return (niy) c85.cz();
                case 178:
                    nfh c86 = niy.c();
                    c86.ee(15);
                    return (niy) c86.cz();
                case 179:
                    nfh c87 = niy.c();
                    c87.ee(15);
                    return (niy) c87.cz();
                case 180:
                    nfh c88 = niy.c();
                    c88.ee(15);
                    return (niy) c88.cz();
                case 181:
                    nfh c89 = niy.c();
                    c89.ee(21);
                    return (niy) c89.cz();
                case 182:
                    nfh c90 = niy.c();
                    c90.ee(6);
                    return (niy) c90.cz();
                case 183:
                    nfh c91 = niy.c();
                    c91.ee(8);
                    return (niy) c91.cz();
                case 184:
                    nfh c92 = niy.c();
                    c92.ee(2);
                    return (niy) c92.cz();
                case 185:
                    nfh c93 = niy.c();
                    c93.ee(9);
                    return (niy) c93.cz();
                case 186:
                    nfh c94 = niy.c();
                    nfh c95 = niw.c();
                    c95.dZ(6);
                    c95.dZ(9);
                    nfh c96 = nix.c();
                    c96.eb(10);
                    c96.eb(11);
                    c95.dY((nix) c96.cz());
                    c94.ec((niw) c95.cz());
                    return (niy) c94.cz();
                case 187:
                    nfh c97 = niy.c();
                    nfh c98 = nix.c();
                    c98.eb(19);
                    nfh c99 = niw.c();
                    c99.dZ(9);
                    c99.dZ(8);
                    c98.ea((niw) c99.cz());
                    c97.ed((nix) c98.cz());
                    return (niy) c97.cz();
                case 188:
                    nfh c100 = niy.c();
                    nfh c101 = nix.c();
                    c101.eb(3);
                    c101.eb(15);
                    c100.ed((nix) c101.cz());
                    return (niy) c100.cz();
                case 189:
                    nfh c102 = niy.c();
                    nfh c103 = nix.c();
                    c103.eb(3);
                    c103.eb(15);
                    c102.ed((nix) c103.cz());
                    return (niy) c102.cz();
                case 190:
                    nfh c104 = niy.c();
                    nfh c105 = nix.c();
                    c105.eb(3);
                    c105.eb(15);
                    c104.ed((nix) c105.cz());
                    return (niy) c104.cz();
                case 191:
                    nfh c106 = niy.c();
                    nfh c107 = nix.c();
                    c107.eb(3);
                    c107.eb(15);
                    c106.ed((nix) c107.cz());
                    return (niy) c106.cz();
                case 192:
                    nfh c108 = niy.c();
                    c108.ee(2);
                    return (niy) c108.cz();
                case 193:
                    nfh c109 = niy.c();
                    c109.ee(2);
                    return (niy) c109.cz();
                case 194:
                    nfh c110 = niy.c();
                    c110.ee(2);
                    return (niy) c110.cz();
                case 195:
                    nfh c111 = niy.c();
                    c111.ee(26);
                    return (niy) c111.cz();
                case 196:
                    nfh c112 = niy.c();
                    c112.ee(3);
                    return (niy) c112.cz();
                case 197:
                    nfh c113 = niy.c();
                    c113.ee(13);
                    return (niy) c113.cz();
                default:
                    switch (i2) {
                        case 199:
                            nfh c114 = niy.c();
                            c114.ee(2);
                            return (niy) c114.cz();
                        case 200:
                            nfh c115 = niy.c();
                            c115.ee(2);
                            return (niy) c115.cz();
                        case 201:
                            nfh c116 = niy.c();
                            c116.ee(2);
                            return (niy) c116.cz();
                        case 202:
                            nfh c117 = niy.c();
                            c117.ee(2);
                            return (niy) c117.cz();
                        case 203:
                            nfh c118 = niy.c();
                            c118.ee(2);
                            return (niy) c118.cz();
                        case 204:
                            nfh c119 = niy.c();
                            c119.ee(14);
                            return (niy) c119.cz();
                        case 205:
                            nfh c120 = niy.c();
                            c120.ee(2);
                            return (niy) c120.cz();
                        case 206:
                            nfh c121 = niy.c();
                            c121.ee(2);
                            return (niy) c121.cz();
                        case 207:
                            nfh c122 = niy.c();
                            c122.ee(2);
                            return (niy) c122.cz();
                        case 208:
                            nfh c123 = niy.c();
                            c123.ee(3);
                            return (niy) c123.cz();
                        case 209:
                            nfh c124 = niy.c();
                            c124.ee(2);
                            return (niy) c124.cz();
                        case 210:
                            nfh c125 = niy.c();
                            nfh c126 = nix.c();
                            c126.eb(25);
                            c126.eb(24);
                            c125.ed((nix) c126.cz());
                            return (niy) c125.cz();
                        case 211:
                            nfh c127 = niy.c();
                            nfh c128 = nix.c();
                            c128.eb(25);
                            c128.eb(24);
                            c127.ed((nix) c128.cz());
                            return (niy) c127.cz();
                        case 212:
                            nfh c129 = niy.c();
                            nfh c130 = nix.c();
                            c130.eb(25);
                            c130.eb(24);
                            c129.ed((nix) c130.cz());
                            return (niy) c129.cz();
                        case 213:
                            nfh c131 = niy.c();
                            c131.ee(2);
                            return (niy) c131.cz();
                        case 214:
                            nfh c132 = niy.c();
                            c132.ee(2);
                            return (niy) c132.cz();
                        case 215:
                            nfh c133 = niy.c();
                            c133.ee(17);
                            return (niy) c133.cz();
                        case 216:
                            nfh c134 = niy.c();
                            c134.ee(2);
                            return (niy) c134.cz();
                        case 217:
                            nfh c135 = niy.c();
                            c135.ee(4);
                            return (niy) c135.cz();
                        case 218:
                            nfh c136 = niy.c();
                            c136.ee(10);
                            return (niy) c136.cz();
                        case 219:
                            nfh c137 = niy.c();
                            c137.ee(2);
                            return (niy) c137.cz();
                        case 220:
                            nfh c138 = niy.c();
                            c138.ee(2);
                            return (niy) c138.cz();
                        default:
                            switch (i2) {
                                case 222:
                                    nfh c139 = niy.c();
                                    c139.ee(2);
                                    return (niy) c139.cz();
                                case 223:
                                    nfh c140 = niy.c();
                                    c140.ee(1);
                                    return (niy) c140.cz();
                                case 224:
                                    nfh c141 = niy.c();
                                    c141.ee(18);
                                    return (niy) c141.cz();
                                case 225:
                                    nfh c142 = niy.c();
                                    c142.ee(18);
                                    return (niy) c142.cz();
                                case 226:
                                    nfh c143 = niy.c();
                                    c143.ee(9);
                                    return (niy) c143.cz();
                                case 227:
                                    nfh c144 = niy.c();
                                    c144.ee(18);
                                    return (niy) c144.cz();
                                case 228:
                                    nfh c145 = niy.c();
                                    c145.ee(2);
                                    return (niy) c145.cz();
                                case 229:
                                    nfh c146 = niy.c();
                                    c146.ee(2);
                                    return (niy) c146.cz();
                                case 230:
                                    nfh c147 = niy.c();
                                    c147.ee(2);
                                    return (niy) c147.cz();
                                case 231:
                                    nfh c148 = niy.c();
                                    c148.ee(2);
                                    return (niy) c148.cz();
                                case 232:
                                    nfh c149 = niy.c();
                                    c149.ee(2);
                                    return (niy) c149.cz();
                                case 233:
                                    nfh c150 = niy.c();
                                    c150.ee(20);
                                    return (niy) c150.cz();
                                case 234:
                                    nfh c151 = niy.c();
                                    c151.ee(22);
                                    return (niy) c151.cz();
                                case 235:
                                    nfh c152 = niy.c();
                                    c152.ee(22);
                                    return (niy) c152.cz();
                                case 236:
                                    nfh c153 = niy.c();
                                    c153.ee(22);
                                    return (niy) c153.cz();
                                case 237:
                                    nfh c154 = niy.c();
                                    c154.ee(21);
                                    return (niy) c154.cz();
                                case 238:
                                    nfh c155 = niy.c();
                                    c155.ee(23);
                                    return (niy) c155.cz();
                                case 239:
                                    nfh c156 = niy.c();
                                    c156.ee(4);
                                    return (niy) c156.cz();
                                case 240:
                                    nfh c157 = niy.c();
                                    c157.ee(2);
                                    return (niy) c157.cz();
                                case 241:
                                    nfh c158 = niy.c();
                                    c158.ee(2);
                                    return (niy) c158.cz();
                                case 242:
                                    nfh c159 = niy.c();
                                    c159.ee(2);
                                    return (niy) c159.cz();
                                case 243:
                                    nfh c160 = niy.c();
                                    c160.ee(2);
                                    return (niy) c160.cz();
                                case 244:
                                    nfh c161 = niy.c();
                                    c161.ee(27);
                                    return (niy) c161.cz();
                                case 245:
                                    nfh c162 = niy.c();
                                    c162.ee(2);
                                    return (niy) c162.cz();
                                case 246:
                                    nfh c163 = niy.c();
                                    c163.ee(2);
                                    return (niy) c163.cz();
                                case 247:
                                    nfh c164 = niy.c();
                                    c164.ee(2);
                                    return (niy) c164.cz();
                                default:
                                    switch (i2) {
                                        case 250:
                                            nfh c165 = niy.c();
                                            c165.ee(2);
                                            return (niy) c165.cz();
                                        case 251:
                                            nfh c166 = niy.c();
                                            c166.ee(2);
                                            return (niy) c166.cz();
                                        case 252:
                                            nfh c167 = niy.c();
                                            c167.ee(4);
                                            return (niy) c167.cz();
                                        case 253:
                                            nfh c168 = niy.c();
                                            c168.ee(4);
                                            return (niy) c168.cz();
                                        case 254:
                                            nfh c169 = niy.c();
                                            c169.ee(4);
                                            return (niy) c169.cz();
                                        case 255:
                                            nfh c170 = niy.c();
                                            c170.ee(2);
                                            return (niy) c170.cz();
                                        case 256:
                                            nfh c171 = niy.c();
                                            c171.ee(28);
                                            return (niy) c171.cz();
                                        case 257:
                                            nfh c172 = niy.c();
                                            c172.ee(29);
                                            return (niy) c172.cz();
                                        case 258:
                                            nfh c173 = niy.c();
                                            c173.ee(29);
                                            return (niy) c173.cz();
                                        case 259:
                                            nfh c174 = niy.c();
                                            c174.ee(29);
                                            return (niy) c174.cz();
                                        case 260:
                                            nfh c175 = niy.c();
                                            c175.ee(2);
                                            return (niy) c175.cz();
                                        case 261:
                                            nfh c176 = niy.c();
                                            c176.ee(2);
                                            return (niy) c176.cz();
                                        case 262:
                                            nfh c177 = niy.c();
                                            c177.ee(18);
                                            return (niy) c177.cz();
                                        case 263:
                                            nfh c178 = niy.c();
                                            c178.ee(2);
                                            return (niy) c178.cz();
                                        case 264:
                                            nfh c179 = niy.c();
                                            c179.ee(2);
                                            return (niy) c179.cz();
                                        case 265:
                                            nfh c180 = niy.c();
                                            c180.ee(22);
                                            return (niy) c180.cz();
                                        case 266:
                                            nfh c181 = niy.c();
                                            c181.ee(22);
                                            return (niy) c181.cz();
                                        case 267:
                                            nfh c182 = niy.c();
                                            c182.ee(2);
                                            return (niy) c182.cz();
                                        case 268:
                                            nfh c183 = niy.c();
                                            c183.ee(5);
                                            return (niy) c183.cz();
                                        case 269:
                                            nfh c184 = niy.c();
                                            c184.ee(2);
                                            return (niy) c184.cz();
                                        case 270:
                                            nfh c185 = niy.c();
                                            c185.ee(2);
                                            return (niy) c185.cz();
                                        case 271:
                                            nfh c186 = niy.c();
                                            c186.ee(2);
                                            return (niy) c186.cz();
                                        case 272:
                                            nfh c187 = niy.c();
                                            c187.ee(2);
                                            return (niy) c187.cz();
                                        case 273:
                                            nfh c188 = niy.c();
                                            c188.ee(2);
                                            return (niy) c188.cz();
                                        case 274:
                                            nfh c189 = niy.c();
                                            c189.ee(2);
                                            return (niy) c189.cz();
                                        case 275:
                                            nfh c190 = niy.c();
                                            c190.ee(2);
                                            return (niy) c190.cz();
                                        case 276:
                                            nfh c191 = niy.c();
                                            c191.ee(31);
                                            return (niy) c191.cz();
                                        case 277:
                                            nfh c192 = niy.c();
                                            c192.ee(5);
                                            return (niy) c192.cz();
                                        case 278:
                                            nfh c193 = niy.c();
                                            c193.ee(5);
                                            return (niy) c193.cz();
                                        case 279:
                                            nfh c194 = niy.c();
                                            c194.ee(2);
                                            return (niy) c194.cz();
                                        case 280:
                                            nfh c195 = niy.c();
                                            c195.ee(2);
                                            return (niy) c195.cz();
                                        case 281:
                                            nfh c196 = niy.c();
                                            c196.ee(32);
                                            return (niy) c196.cz();
                                        case 282:
                                            nfh c197 = niy.c();
                                            c197.ee(32);
                                            return (niy) c197.cz();
                                        case 283:
                                            nfh c198 = niy.c();
                                            c198.ee(32);
                                            return (niy) c198.cz();
                                        case 284:
                                            nfh c199 = niy.c();
                                            c199.ee(33);
                                            return (niy) c199.cz();
                                        case 285:
                                            nfh c200 = niy.c();
                                            c200.ee(2);
                                            return (niy) c200.cz();
                                        case 286:
                                            nfh c201 = niy.c();
                                            c201.ee(2);
                                            return (niy) c201.cz();
                                        case 287:
                                            nfh c202 = niy.c();
                                            c202.ee(2);
                                            return (niy) c202.cz();
                                        case 288:
                                            nfh c203 = niy.c();
                                            c203.ee(22);
                                            return (niy) c203.cz();
                                        case 289:
                                            nfh c204 = niy.c();
                                            c204.ee(2);
                                            return (niy) c204.cz();
                                        case 290:
                                            nfh c205 = niy.c();
                                            c205.ee(34);
                                            return (niy) c205.cz();
                                        case 291:
                                            nfh c206 = niy.c();
                                            c206.ee(34);
                                            return (niy) c206.cz();
                                        case 292:
                                            nfh c207 = niy.c();
                                            c207.ee(34);
                                            return (niy) c207.cz();
                                        case 293:
                                            nfh c208 = niy.c();
                                            c208.ee(34);
                                            return (niy) c208.cz();
                                        case 294:
                                            nfh c209 = niy.c();
                                            c209.ee(35);
                                            return (niy) c209.cz();
                                        case 295:
                                            nfh c210 = niy.c();
                                            c210.ee(35);
                                            return (niy) c210.cz();
                                        case 296:
                                            nfh c211 = niy.c();
                                            c211.ee(35);
                                            return (niy) c211.cz();
                                        case 297:
                                            nfh c212 = niy.c();
                                            c212.ee(35);
                                            return (niy) c212.cz();
                                        case 298:
                                            nfh c213 = niy.c();
                                            c213.ee(36);
                                            return (niy) c213.cz();
                                        case 299:
                                            nfh c214 = niy.c();
                                            c214.ee(36);
                                            return (niy) c214.cz();
                                        case 300:
                                            nfh c215 = niy.c();
                                            c215.ee(36);
                                            return (niy) c215.cz();
                                        case 301:
                                            nfh c216 = niy.c();
                                            c216.ee(36);
                                            return (niy) c216.cz();
                                        case 302:
                                            nfh c217 = niy.c();
                                            c217.ee(2);
                                            return (niy) c217.cz();
                                        case 303:
                                            nfh c218 = niy.c();
                                            c218.ee(2);
                                            return (niy) c218.cz();
                                        case 304:
                                            nfh c219 = niy.c();
                                            c219.ee(2);
                                            return (niy) c219.cz();
                                        case 305:
                                            nfh c220 = niy.c();
                                            c220.ee(2);
                                            return (niy) c220.cz();
                                        case 306:
                                            nfh c221 = niy.c();
                                            c221.ee(37);
                                            return (niy) c221.cz();
                                        case 307:
                                            nfh c222 = niy.c();
                                            c222.ee(2);
                                            return (niy) c222.cz();
                                        case 308:
                                            nfh c223 = niy.c();
                                            c223.ee(2);
                                            return (niy) c223.cz();
                                        case 309:
                                            nfh c224 = niy.c();
                                            c224.ee(39);
                                            return (niy) c224.cz();
                                        case 310:
                                            nfh c225 = niy.c();
                                            c225.ee(2);
                                            return (niy) c225.cz();
                                        case 311:
                                            nfh c226 = niy.c();
                                            c226.ee(2);
                                            return (niy) c226.cz();
                                        case 312:
                                            nfh c227 = niy.c();
                                            c227.ee(38);
                                            return (niy) c227.cz();
                                        case 313:
                                            nfh c228 = niy.c();
                                            c228.ee(29);
                                            return (niy) c228.cz();
                                        case 314:
                                            nfh c229 = niy.c();
                                            c229.ee(42);
                                            return (niy) c229.cz();
                                        case 315:
                                            nfh c230 = niy.c();
                                            c230.ee(42);
                                            return (niy) c230.cz();
                                        case 316:
                                            nfh c231 = niy.c();
                                            c231.ee(2);
                                            return (niy) c231.cz();
                                        case 317:
                                            nfh c232 = niy.c();
                                            c232.ee(2);
                                            return (niy) c232.cz();
                                        case 318:
                                            nfh c233 = niy.c();
                                            c233.ee(21);
                                            return (niy) c233.cz();
                                        case 319:
                                            nfh c234 = niy.c();
                                            c234.ee(6);
                                            return (niy) c234.cz();
                                        case 320:
                                            nfh c235 = niy.c();
                                            c235.ee(40);
                                            return (niy) c235.cz();
                                        case 321:
                                            nfh c236 = niy.c();
                                            c236.ee(2);
                                            return (niy) c236.cz();
                                        case 322:
                                            nfh c237 = niy.c();
                                            c237.ee(41);
                                            return (niy) c237.cz();
                                        case 323:
                                            nfh c238 = niy.c();
                                            c238.ee(41);
                                            return (niy) c238.cz();
                                        case 324:
                                            nfh c239 = niy.c();
                                            c239.ee(41);
                                            return (niy) c239.cz();
                                        case 325:
                                            nfh c240 = niy.c();
                                            c240.ee(41);
                                            return (niy) c240.cz();
                                        case 326:
                                            nfh c241 = niy.c();
                                            c241.ee(2);
                                            return (niy) c241.cz();
                                        case 327:
                                            nfh c242 = niy.c();
                                            c242.ee(2);
                                            return (niy) c242.cz();
                                        case 328:
                                            nfh c243 = niy.c();
                                            c243.ee(42);
                                            return (niy) c243.cz();
                                        case 329:
                                            nfh c244 = niy.c();
                                            c244.ee(43);
                                            return (niy) c244.cz();
                                        case 330:
                                            nfh c245 = niy.c();
                                            c245.ee(2);
                                            return (niy) c245.cz();
                                        case 331:
                                            nfh c246 = niy.c();
                                            c246.ee(44);
                                            return (niy) c246.cz();
                                        case 332:
                                            nfh c247 = niy.c();
                                            c247.ee(45);
                                            return (niy) c247.cz();
                                        case 333:
                                            nfh c248 = niy.c();
                                            c248.ee(2);
                                            return (niy) c248.cz();
                                        case 334:
                                            nfh c249 = niy.c();
                                            c249.ee(46);
                                            return (niy) c249.cz();
                                        case 335:
                                            nfh c250 = niy.c();
                                            c250.ee(1);
                                            return (niy) c250.cz();
                                        case 336:
                                            nfh c251 = niy.c();
                                            c251.ee(1);
                                            return (niy) c251.cz();
                                        case 337:
                                            nfh c252 = niy.c();
                                            c252.ee(1);
                                            return (niy) c252.cz();
                                        case 338:
                                            nfh c253 = niy.c();
                                            c253.ee(1);
                                            return (niy) c253.cz();
                                        case 339:
                                            nfh c254 = niy.c();
                                            c254.ee(1);
                                            return (niy) c254.cz();
                                        case 340:
                                            nfh c255 = niy.c();
                                            c255.ee(2);
                                            return (niy) c255.cz();
                                        case 341:
                                            nfh c256 = niy.c();
                                            c256.ee(47);
                                            return (niy) c256.cz();
                                        case 342:
                                            nfh c257 = niy.c();
                                            c257.ee(47);
                                            return (niy) c257.cz();
                                        case 343:
                                            nfh c258 = niy.c();
                                            c258.ee(48);
                                            return (niy) c258.cz();
                                        case 344:
                                            nfh c259 = niy.c();
                                            c259.ee(49);
                                            return (niy) c259.cz();
                                        case 345:
                                            nfh c260 = niy.c();
                                            c260.ee(50);
                                            return (niy) c260.cz();
                                        default:
                                            switch (i2) {
                                                case 353:
                                                    nfh c261 = niy.c();
                                                    c261.ee(55);
                                                    return (niy) c261.cz();
                                                case 354:
                                                    nfh c262 = niy.c();
                                                    c262.ee(51);
                                                    return (niy) c262.cz();
                                                case 355:
                                                    nfh c263 = niy.c();
                                                    c263.ee(53);
                                                    return (niy) c263.cz();
                                                case 356:
                                                    nfh c264 = niy.c();
                                                    c264.ee(53);
                                                    return (niy) c264.cz();
                                                case 357:
                                                    nfh c265 = niy.c();
                                                    c265.ee(54);
                                                    return (niy) c265.cz();
                                                case 358:
                                                    nfh c266 = niy.c();
                                                    c266.ee(6);
                                                    return (niy) c266.cz();
                                                case 359:
                                                    nfh c267 = niy.c();
                                                    c267.ee(29);
                                                    return (niy) c267.cz();
                                                case 360:
                                                    nfh c268 = niy.c();
                                                    c268.ee(56);
                                                    return (niy) c268.cz();
                                                case 361:
                                                    nfh c269 = niy.c();
                                                    c269.ee(56);
                                                    return (niy) c269.cz();
                                                case 362:
                                                    nfh c270 = niy.c();
                                                    c270.ee(56);
                                                    return (niy) c270.cz();
                                                case 363:
                                                    nfh c271 = niy.c();
                                                    c271.ee(56);
                                                    return (niy) c271.cz();
                                                case 364:
                                                    nfh c272 = niy.c();
                                                    c272.ee(2);
                                                    return (niy) c272.cz();
                                                case 365:
                                                    nfh c273 = niy.c();
                                                    c273.ee(2);
                                                    return (niy) c273.cz();
                                                case 366:
                                                    nfh c274 = niy.c();
                                                    c274.ee(2);
                                                    return (niy) c274.cz();
                                                case 367:
                                                    nfh c275 = niy.c();
                                                    c275.ee(1);
                                                    return (niy) c275.cz();
                                                default:
                                                    switch (i2) {
                                                        case 369:
                                                            nfh c276 = niy.c();
                                                            c276.ee(2);
                                                            return (niy) c276.cz();
                                                        case 370:
                                                            nfh c277 = niy.c();
                                                            c277.ee(70);
                                                            return (niy) c277.cz();
                                                        case 371:
                                                            nfh c278 = niy.c();
                                                            c278.ee(70);
                                                            return (niy) c278.cz();
                                                        case 372:
                                                            nfh c279 = niy.c();
                                                            c279.ee(70);
                                                            return (niy) c279.cz();
                                                        case 373:
                                                            nfh c280 = niy.c();
                                                            c280.ee(69);
                                                            return (niy) c280.cz();
                                                        case 374:
                                                            nfh c281 = niy.c();
                                                            c281.ee(69);
                                                            return (niy) c281.cz();
                                                        case 375:
                                                            nfh c282 = niy.c();
                                                            c282.ee(68);
                                                            return (niy) c282.cz();
                                                        case 376:
                                                            nfh c283 = niy.c();
                                                            c283.ee(68);
                                                            return (niy) c283.cz();
                                                        case 377:
                                                            nfh c284 = niy.c();
                                                            c284.ee(67);
                                                            return (niy) c284.cz();
                                                        case 378:
                                                            nfh c285 = niy.c();
                                                            c285.ee(67);
                                                            return (niy) c285.cz();
                                                        case 379:
                                                            nfh c286 = niy.c();
                                                            c286.ee(66);
                                                            return (niy) c286.cz();
                                                        case 380:
                                                            nfh c287 = niy.c();
                                                            c287.ee(66);
                                                            return (niy) c287.cz();
                                                        case 381:
                                                            nfh c288 = niy.c();
                                                            c288.ee(65);
                                                            return (niy) c288.cz();
                                                        case 382:
                                                            nfh c289 = niy.c();
                                                            nfh c290 = nix.c();
                                                            c290.eb(65);
                                                            c290.eb(66);
                                                            c289.ed((nix) c290.cz());
                                                            return (niy) c289.cz();
                                                        case 383:
                                                            nfh c291 = niy.c();
                                                            nfh c292 = nix.c();
                                                            c292.eb(65);
                                                            c292.eb(66);
                                                            c291.ed((nix) c292.cz());
                                                            return (niy) c291.cz();
                                                        case 384:
                                                            nfh c293 = niy.c();
                                                            c293.ee(64);
                                                            return (niy) c293.cz();
                                                        case 385:
                                                            nfh c294 = niy.c();
                                                            c294.ee(64);
                                                            return (niy) c294.cz();
                                                        case 386:
                                                            nfh c295 = niy.c();
                                                            c295.ee(64);
                                                            return (niy) c295.cz();
                                                        case 387:
                                                            nfh c296 = niy.c();
                                                            c296.ee(63);
                                                            return (niy) c296.cz();
                                                        case 388:
                                                            nfh c297 = niy.c();
                                                            c297.ee(63);
                                                            return (niy) c297.cz();
                                                        case 389:
                                                            nfh c298 = niy.c();
                                                            c298.ee(62);
                                                            return (niy) c298.cz();
                                                        case 390:
                                                            nfh c299 = niy.c();
                                                            c299.ee(62);
                                                            return (niy) c299.cz();
                                                        case 391:
                                                            nfh c300 = niy.c();
                                                            c300.ee(62);
                                                            return (niy) c300.cz();
                                                        case 392:
                                                            nfh c301 = niy.c();
                                                            c301.ee(61);
                                                            return (niy) c301.cz();
                                                        case 393:
                                                            nfh c302 = niy.c();
                                                            c302.ee(61);
                                                            return (niy) c302.cz();
                                                        case 394:
                                                            nfh c303 = niy.c();
                                                            c303.ee(60);
                                                            return (niy) c303.cz();
                                                        case 395:
                                                            nfh c304 = niy.c();
                                                            c304.ee(60);
                                                            return (niy) c304.cz();
                                                        case 396:
                                                            nfh c305 = niy.c();
                                                            nfh c306 = nix.c();
                                                            c306.eb(59);
                                                            c306.eb(58);
                                                            c305.ed((nix) c306.cz());
                                                            return (niy) c305.cz();
                                                        case 397:
                                                            nfh c307 = niy.c();
                                                            c307.ee(59);
                                                            return (niy) c307.cz();
                                                        case 398:
                                                            nfh c308 = niy.c();
                                                            nfh c309 = nix.c();
                                                            c309.eb(59);
                                                            c309.eb(58);
                                                            c308.ed((nix) c309.cz());
                                                            return (niy) c308.cz();
                                                        case 399:
                                                            nfh c310 = niy.c();
                                                            c310.ee(57);
                                                            return (niy) c310.cz();
                                                        case 400:
                                                            nfh c311 = niy.c();
                                                            c311.ee(57);
                                                            return (niy) c311.cz();
                                                        default:
                                                            nfh c312 = niy.c();
                                                            c312.ee(1);
                                                            return (niy) c312.cz();
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            nfh c313 = niy.c();
            c313.ee(1);
            return (niy) c313.cz();
        }
    }
}
