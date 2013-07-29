

    package imperialskull.at1;



    import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import imperialskull.at1.armor.ArkaneArmor;
import imperialskull.at1.block.ArkaneBlocks;
import imperialskull.at1.block.EntityC4Primed;
import imperialskull.at1.config.Config;
import imperialskull.at1.core.proxy.CommonProxy;
import imperialskull.at1.core.proxy.RenderC4Primed;
import imperialskull.at1.creativetab.CreativeTabAT1;
import imperialskull.at1.entity.EntityJeraPotion;
import imperialskull.at1.item.ArkaneItems;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.network.PacketHandler;
import imperialskull.at1.ore.Oredicthandler;
import imperialskull.at1.recipes.ArkanatechRecipes;
import imperialskull.at1.recipes.ArkaneCraftingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



    /**
     * 
     * @author Imperialskull
     *
     */
    @Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

    @NetworkMod(clientSideRequired= true, serverSideRequired = false, channels = {Reference.CHANNEL_NAME}, packetHandler = PacketHandler.class)
    



    public class Arkanatech {
        
        
        
        @Instance(Reference.MOD_ID)
        public static Arkanatech instance;
        
        @SidedProxy(clientSide = Reference.CLIENTSIDE_PROXY_CLASS, serverSide = Reference.SERVERSIDE_PROXY_CLASS)
        public static CommonProxy proxy;
        
        public static CreativeTabs tabsAT1 = new CreativeTabAT1(CreativeTabs.getNextID(),Reference.MOD_ID);

        /***
        * This is code that is executed prior to your mod being initialized into of Minecraft
        * Examples of code that could be run here;
        *
        * Initializing your items/blocks (you must do this here)
        * Setting up your own custom logger for writing log data to
        * Loading your language translations for your mod (if your mod has translations for other languages)
        * Registering your mod's key bindings and sounds
        *
        * @param event The Forge ModLoader pre-initialization event
        */
        

            @EventHandler
            public void preInit(FMLPreInitializationEvent event) {
                
                ArkaneBlocks.init();
                ArkaneItems.init();
                ArkaneArmor.init();
                ArkanatechRecipes.init();
                Oredicthandler.oreRecipes();

                Config.initConfig();
                
                
                
                
            }
            
            /***
        * This is code that is executed when your mod is being initialized in Minecraft
        * Examples of code that could be run here;
        *
        * Registering your GUI Handler
        * Registering your different event listeners
        * Registering your different tile entities
        * Adding in any recipes you have
        *
        * @param event The Forge ModLoader initialization event
        */
            @EventHandler
            public void init(FMLInitializationEvent event) {
               //GUI HANDLER 
                NetworkRegistry.instance().registerGuiHandler(instance, proxy);
                GameRegistry.registerCraftingHandler( new ArkaneCraftingHandler());
                
                Oredicthandler.oreRegistration();
                
                
                
                EntityRegistry.registerModEntity(EntityC4Primed.class, "primedC4", EntityRegistry.findGlobalUniqueEntityId(),this, 128, 1, true);
                EntityRegistry.registerModEntity(EntityJeraPotion.class, "potionJera", EntityRegistry.findGlobalUniqueEntityId(),this, 129, 1, true);
   
                RenderingRegistry.registerEntityRenderingHandler(EntityJeraPotion.class, new RenderSnowball(ArkaneItems.arkanejello, 0));
                             
                RenderingRegistry.registerEntityRenderingHandler(EntityC4Primed.class, new RenderC4Primed());
                
                proxy.initRenderingAndTextures();
                proxy.registerTileEntities();
                
                LanguageRegistry.instance().addStringLocalization("itemGroup.at1","Arkanatech");

         
                

                
            }
            

            /***
        * This is code that is executed after all mods are initialized in Minecraft
        * This is a good place to execute code that interacts with other mods (ie, loads an addon module
        * of your mod if you find a particular mod).
        *
        * @param event The Forge ModLoader post-initialization event
        */
            @EventHandler
            public void postInit(FMLPostInitializationEvent event) {
            	
            	
                
             
                
            }
            
            //Language fixes for entities and creative tabs go here

        }

